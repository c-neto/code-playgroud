#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void)
{
  
	setlocale(LC_ALL,""); 
  
 	float n1, n2, mf;
 	int f;
  
 	printf ("Informe a NOTA 1: ");
  	scanf ("%f", & n1);
  	
  	printf ("Informe a NOTA 2: ");
  	scanf ("%f", & n2);
  	
  	printf ("Quantidade de Faltas: ");
  	scanf ("%d", & f);
  	
  	mf=(n1+n2)/2;

	if (f>=20){
		
		printf ("Voc� est� REPROVADO, voc� excedeu o limite de faltas");
		
	}
	

	else if (mf>=0 && mf<4){
		
		printf ("Voc� est� REPROVADO, sua nota de conceito final �: E");
		
	}
	
	else if (mf>=4 && mf<6){
	
		printf ("Voc� est� REPROVADO, sua nota de conceito final �: D");

	}
	
	else if (mf>=6 && mf<7.5){
	
		printf ("Voc� est� APROVADO, sua nota de conceito final �: C");
}
		
	else if (mf>=7.5 && mf<9){
	
		printf ("Voc� est� APROVADO, sua nota de conceito final �: B");	

	}
	
	else if (mf>=9 && mf<=10){
	
		printf ("Voc� est� APROVADO, sua nota de conceito final �: A");	

	}
			
	else{
		
		printf ("M�dia invalida: %.2f", mf);
		printf ("\nA m�dia das notas excederam o valor 10: ", mf);		
	}
  
}
