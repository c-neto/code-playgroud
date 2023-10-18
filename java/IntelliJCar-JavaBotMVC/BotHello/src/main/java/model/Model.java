package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.pengrad.telegrambot.model.Update;

import view.Observer;

public class Model implements Subject {

	private List<Observer> observers = new LinkedList<Observer>();
	private List<Car> cars = new ArrayList<>();

	private static Model uniqueInstance;

	private Map<Long, String> time = new HashMap<Long, String>();

	
	// Setar o indice dos resultados
	public void searchTime(Update update) throws FileNotFoundException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina searchTime:");

		String data = null;
	
		int index = this.verifyRegister(update);

		DateJcar dateJcar = new DateJcar(update.message().text());
		
		if (index != -1) {

			if( dateJcar.getValue() != null) {
				
				if(dateJcar.isRouteToday || dateJcar.isRouteAnotherDay) {
					data = ToolBox.loadApi("SERVER_ADDRESS")+dateJcar.getValue();
				}
				else {
					this.time.put(update.message().chat().id(), dateJcar.getValue());
					data = "Results for the time: " + update.message().text();
				}
				
			}
			else {
				data = "Data or Hour not Valid";
			}

			System.out.println(
					"\tUsuário:" + update.message().chat().username() + " - ChatID:" + update.message().chat().id());
			System.out.println("\tSetou o indice UTC: " + this.time.get(update.message().chat().id()));
		}
		
		this.inviteMessage(data, update);

	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers(long chatId, String data) {
		for (Observer observer : observers) {
			observer.updateObserver(chatId, data);
		}
	}

	public static Model getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Model();
		}
		return uniqueInstance;
	}

	// BATERIA : getBat : Battery
	public void searchBat(Update update) throws JsonSyntaxException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina searchBat: ");

		String data = null;

		int index = this.verifyRegister(update);

		if (index != -1) {
			this.populityDatas(update);
			data = this.cars.get(index).getBat();
		}

		this.inviteMessage(data, update);
	}


	// GASOLINA : getGas : Gasoline
	public void searchGas(Update update) throws JsonSyntaxException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina searchGas:");

		String data = null;

		int index = this.verifyRegister(update);

		if (index != -1) {
			this.populityDatas(update);
			data = this.cars.get(index).getGas();
		}

		this.inviteMessage(data, update);

	}

	// GSM Nivel : getGsm : Jcar Access Nivel
	public void searchGsm(Update update) throws JsonSyntaxException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina searchGsm:");

		String data = null;

		int index = this.verifyRegister(update);

		if (index != -1) {
			this.populityDatas(update);
			data = this.cars.get(index).getGsm();
		}

		this.inviteMessage(data, update);

	}

	// GPS : getGps : GPS
	public void searchGPS(Update update) throws JsonSyntaxException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina searchGPS:");
		String data = null;

		int index = this.verifyRegister(update);

		this.populityDatas(update);

		if (index != -1) {
			
			if (this.cars.get(index).getLat() == "\"Servers not avaible or Data not validate\"") {
				data = "Servers not avaible or Data not validate";
			}
			else {
				data = "Your car's status: " 
					+ ToolBox.loadApi("GOOGLE-MAPS-STATUS")
					+ "/onepoint?date=today&index=now"
					+ "\n\nYour car's status: "
					+ ToolBox.loadApi("GOOGLE-MAPS-STATUS")
					+ this.time.get(update.message().chat().id())
					+ "\n";
			}
			
		}
		if (data != null) {
			this.populityDatas(update);
		}
		this.inviteMessage(data, update);

	}

	// Registrar carro
	public void registerCar(Update update) throws FileNotFoundException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina registerCar");

		String data = null;

		int index = this.verifyRegister(update);

		if (index != -1) {
			data = ToolBox.loadDialogue("EXIST-CAR");
		} else {
			data = ToolBox.loadDialogue("REGISTER-CAR");
			this.cars.add(new Car(update.message().chat().id()));
			this.time.put(update.message().chat().id(), new String("/get/data/now"));
		}

		this.inviteMessage(data, update);

	}

	// Enviar mensagem
	private void inviteMessage(String data, Update update) throws FileNotFoundException, IOException {

		System.out.println(">>> CLASSE MODEL:\n->\tRotina inviteMessage:");

		if (data != null) {
			this.notifyObservers(update.message().chat().id(), data);
			System.out.println("\t * Enviei isso: " + data + " -> " + update.message().chat().username() + " - ChatID:"
					+ update.message().chat().id() + "\n\n");

		} else {
			this.notifyObservers(update.message().chat().id(), ToolBox.loadDialogue("NOT-REGISTER-CAR"));
			System.out.println("\t * Enviei isso: NOT FOUND(car not registred)-> " + update.message().chat().username()
					+ " - ChatID:" + update.message().chat().id() + "\n\n");
		}

	}

	// Atualizar dados a ser exibidos (conforme o "indice" indicado)
	private void populityDatas(Update update) throws JsonSyntaxException, IOException {
		System.out.println(">>> CLASSE MODEL:\n->\tpopulityDatas");

		Gson gson = new Gson();

		int index = this.verifyRegister(update);

		Car c = new Car(update.message().chat().id());
		System.out.println("\t* Pesquisa para o indice UTC: " + this.time.get(update.message().chat().id()));
		c = gson.fromJson(new ConnectAPI().getJsonFromServer(this.time.get(update.message().chat().id())).toString(),
				Car.class);

		c.setId(update.message().chat().id());

		cars.remove(index);
		cars.add(index, c);

	}

	// Verificar registros (retorna -1 se não existir)
	private int verifyRegister(Update update) {
		System.out.println(">>> CLASSE MODEL:\n->\tverifyRegister:");

		for (int k = 0; k < this.cars.size(); k++) {
			if (this.cars.get(k).getId() == update.message().chat().id()) {
				System.out.println("\t*UserID: " + update.message().chat().id() + "\n\t*Cadastrado no indice: " + k);
				return k;
			}
		}

		System.out.println("\t*UserID: " + update.message().chat().id() + "\n\t*Nao possui cadastro");
		return -1;

	}

}
