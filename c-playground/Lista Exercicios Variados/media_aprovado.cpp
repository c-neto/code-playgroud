/*
	Media >6 Aprovado
*/

#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void)
{
  
	setlocale(LC_ALL,""); 
  
 	float n1, n2, n3, n4, mf;
  
 	printf ("Informe a NOTA 1: ");
  	scanf ("%f", & n1);
  	
  	printf ("Informe a NOTA 2: ");
  	scanf ("%f", & n2);
  	
  	printf ("Informe a NOTA 3: ");
  	scanf ("%f", & n3);
  	
  	printf ("Informe a NOTA 4: ");
  	scanf ("%f", & n4);
  
	mf=(n1+n2+n3+n4)/4;

	if (mf>=6){
		
		printf ("Parab�ns, Voc� est� APROVADO, sua m�dia final � de %.2f", mf);
		printf ("\nM�dia final superior a 6", mf);
	}
	
	else{
		
		printf ("Voc� est� REPROVADO: %.2f", mf);
		printf ("\nInfelizmente sua m�dia final n�o foi superior a 6", mf);		
	}
  
}
