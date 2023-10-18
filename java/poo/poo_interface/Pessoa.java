package datashow;

public class Pessoa implements Informador {

	private final String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
// comportamento do metodo "informar" da interface "Informador" para este objeto	
	public void informar() {
		System.out.println("Nome do Pessoa: " + getNome());
	}
}

/*
	� OBRIGAT�RIO a implementa��o dos m�todos da interface declarada no "implements" 
na classe, se nao for declarada na classe, tem q ser declarada em uma das suas subclasses
	N�o � possivel instanciar objetos de classes abstract, ele apenas serve para pegar 
metodos e variaveis sem a necessidade da instacia de objeto

*/