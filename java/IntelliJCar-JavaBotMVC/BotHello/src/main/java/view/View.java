package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.google.gson.JsonSyntaxException;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

import controller.ControllerBat;
import controller.ControllerDateIndex;
import controller.ControllerGPS;
import controller.ControllerGas;
import controller.ControllerGsm;
import controller.ControllerRegisterCar;
import controller.SearchStrategy;
import model.Model;
import model.ToolBox;
import okhttp3.OkHttpClient;

public class View implements Observer {

	
	public View(Model model, String token) throws FileNotFoundException, IOException {
	    this.model = model;
	    
	    OkHttpClient client = new OkHttpClient.Builder()
	              .connectTimeout(15, TimeUnit.SECONDS)
	              .writeTimeout(15, TimeUnit.SECONDS)
	              .readTimeout(60, TimeUnit.SECONDS)
	              .build();
	    
	    this.bot = TelegramBotAdapter.buildCustom(token, client);
	    this.getDialogues();
	  }
	

	private Model model;
	private TelegramBot bot;

	GetUpdatesResponse updatesResponse;
	SendResponse sendResponse;
	BaseResponse baseResponse;

	private static String msgHello;
	private static String btnGas;
	private static String btnGps;
	private static String btnGsm;
	private static String btnTsp;
	private static String btnBat;

	private void getDialogues() throws FileNotFoundException, IOException {
		this.msgHello = ToolBox.loadDialogue("HELLO");
		this.btnGas = ToolBox.loadDialogue("GAS");
		this.btnGps = ToolBox.loadDialogue("GPS");
		this.btnGsm = ToolBox.loadDialogue("GSM");
		this.btnTsp = ToolBox.loadDialogue("TSP");
		this.btnBat = ToolBox.loadDialogue("BAT");
	}

	int queuesIndex = 0;

	static final int stateNOTHING = 0;
	static final int stateTIME = 1;
	static final int stateGAS = 2;
	static final int stateGPS = 3;
	static final int stateGSM = 4;
	static final int stateBAT = 6;

	private Map<Long, Integer> state = new HashMap<Long, Integer>();

	SearchStrategy searchStrategy; // Strategy Pattern -- connection View -> Controller

	boolean searchBehaviour = false;

	public void receiveUsersMessages() throws JsonSyntaxException, IOException {

		try {
		      updatesResponse = bot.execute(new GetUpdates().limit(100).offset(queuesIndex).timeout(0));
		} catch (Exception e) {
		      System.out.println("\n!!!EERO NO updateResponse fora do while(true)!!!\n"+e.getMessage());
		      
		}

		List<Update> updates = updatesResponse.updates();

		System.out.println("Limpando a lista...");

		for (Update update : updates) {
			queuesIndex = update.updateId() + 1;
		}

		System.out.println("Lista limpa!\n");

		while (true) {

			try {
			      updatesResponse = bot.execute(new GetUpdates().limit(100).offset(queuesIndex).timeout(0));
			} catch (Exception e) {
				System.out.println("\n!!!EERO NO updateResponse dentro do while(true)!!!\n"+e.getMessage());
				continue;
			}

			updates = updatesResponse.updates();

			for (Update update : updates) {
				System.out.println(">>> CLASSE VIEW:");
				System.out.println("\tRequisição numero: " + update.updateId());
				System.out.println("\tNome do usuário: " + update.message().chat().username());
				System.out.println("\tId do usuário: " + update.message().chat().id());
				System.out.println("\tEscreveu: " + update.message().text() + "\n");

				queuesIndex = update.updateId() + 1;

				try {
					if (update.message().text().equals(null)) {
						continue;
					}
				}catch(Exception e) {
					System.out.println("mensagem nula ou nao eh texto...");
					continue;
				}
				
				if (update.message().text().equals("/start")) {

					this.state.put(update.message().chat().id(), stateNOTHING);
					setControllerSearch(new ControllerRegisterCar(model, this));
					this.searchBehaviour = true;

					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),
							"Hello " + update.message().chat().firstName() + "!!!\n" + msgHello)
							.replyMarkup(new ReplyKeyboardMarkup(
									new String[] { btnGps, btnGas },
									new String[] { btnBat, btnGsm}, 
									new String[] { btnTsp })));
				}

				if (state.get(update.message().chat().id()) == null) {
					continue;
				}

				if (update.message().text().equals(btnTsp)) {
					sendResponse = bot.execute(
							new SendMessage(update.message().chat().id(), ToolBox.loadDialogue("SEARCH-TIME")));
					state.put(update.message().chat().id(), stateTIME);
					continue;
				}

				else if (update.message().text().equals(btnBat)) {
					state.put(update.message().chat().id(), stateBAT);

				} else if (update.message().text().equals(btnGas)) {
					state.put(update.message().chat().id(), stateGAS);

				} else if (update.message().text().equals(btnGps)) {
					state.put(update.message().chat().id(), stateGPS);

				} else if (update.message().text().equals(btnGsm)) {
					state.put(update.message().chat().id(), stateGSM);
				}
				
				switch (state.get(update.message().chat().id())) {

					case stateTIME: {
						setControllerSearch(new ControllerDateIndex(model, this));
						this.searchBehaviour = true;
						break;
					}

					case stateBAT: {
						setControllerSearch(new ControllerBat(model, this));
						this.searchBehaviour = true;
						break;
					}
	
					case stateGAS: {
						setControllerSearch(new ControllerGas(model, this));
						this.searchBehaviour = true;
						break;
					}
					case stateGSM: {
						setControllerSearch(new ControllerGsm(model, this));
						this.searchBehaviour = true;
						break;
					}
					case stateGPS: {
						setControllerSearch(new ControllerGPS(model, this));
						this.searchBehaviour = true;
						break;
					}
	
					default: {
						break;
					}
				}

				if (update.callbackQuery() != null) {
					sendResponse = bot.execute(new SendMessage(update.callbackQuery().message().chat().id(),
							update.callbackQuery().data()));
				}

				if (this.searchBehaviour == true) {
					this.callController(update);
				}

			}
		}
	}

	public void setControllerSearch(SearchStrategy controllerSearch) { // Strategy Pattern
		this.searchStrategy = controllerSearch;
	}

	public void callController(Update update) throws JsonSyntaxException, IOException {
		this.searchStrategy.process(update);
	}

	public void sendTypingMessage(Update update) {
		baseResponse = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
	}

	@Override
	public void updateObserver(long chatId, String data) {
		sendResponse = bot.execute(new SendMessage(chatId, data));
		this.searchBehaviour = false;
		state.put(chatId, stateNOTHING);
	}
}