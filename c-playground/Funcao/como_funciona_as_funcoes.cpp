#include <stdio.h>

/*
	A fun��o soma(), ir� assumir os parametros POR ORDEM, ou seja, A, B, C s�o os nomes
	Gen�ricos das vari�veis dessa fun��o, por isso � necess�rio declarar o tipo delas
	por que ela n�o sabe por s� o quais as tipos de variaveis que v�o ser declarado nela
	ent�o, NO CASO DESTA L�GICA ela trabalhar� com os nomes das vari�evis A,B,C no 
	lugar do nome das vari�veis X,Y,Z da fun��o main() que est� a chamar a fun��o soma; 
	A==X;
	B==Y;
	C==Z;
*/

//float � o tipo da vari�vel do return desta fun��o
float soma (int A, int B, int C){ 	
	
	return A+B+C;			
}

// Fun��o main (), sempre vem por ultimo... para identificar as fun��es anteriores
int main(){		
	
	// Declara��o de Vari�veis, percebe-se que tem nomes distintos das variaveis da funcao soma()
	int X=0, Y=0, Z=0; 
	
	
	printf("Digite X: ");
	scanf("%d", & X);	
		
	printf("Digite Y: ");
	scanf("%d", & Y);
		
	printf("Digite Z: ");
	scanf("%d", & Z);
	
	// L�gica simples... vai chamar a fun��o soma, passando como parametro as variaveis X,Y,Z;
	// Ou seja, "soma(X, Y, Z)" vai ser o valor do return da funcao soma();
	// lembrando que a mascara tem que %f, uma vez que foi declarado como float a fun��o soma();
	printf ("%.2f", soma(X, Y, Z) ); 
}
