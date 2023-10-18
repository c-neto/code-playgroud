package pontoxy;

public class Ponto{

	int X, Y;
	
	Ponto(int X, int Y){
		this.X=X;			
		this.Y=Y;
	}
/* O constructor "Ponto" foi criado na classe "Ponto" justamente para que no ato da cria��o do objeto
 * que utilize esta classe como referencia, force a atribui��o dos paramentros na classe main, 
 * this. serve para diferenciar o "X" da classe Ponto, com o "X" do m�todo/constructor Ponto 
*/
			
	double distancia(Ponto p){			
		double disX = Math.pow(X - p.X, 2);
		double disY = Math.pow(Y - p.Y, 2);
		return  Math.sqrt(disX+disY);	
	}
/* Nesse m�todo, o objetivo de ter a assinatura "Ponto p", � inserir outra coordenada
 * para o calculo de distancia
*/
	
	double distancia(){
		double disX = Math.pow(X, 2);	
		double disY = Math.pow(Y, 2);		
		return Math.sqrt(disY+disX);
	}
/* Se o par�metro for "No arguments", o calculo ser� feito com apenas um ponto
*/
	
	void imprimir(){
		System.out.println( distancia() );
	}	
	
	void imprimir(Ponto p){
		System.out.println( distancia(p) );
	}
	
}