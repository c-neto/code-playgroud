/*
	media invalida, aprovado por conselho ...
*/
#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void)
{
  
	setlocale(LC_ALL,""); 
  
 	float n1, n2, n3, mf;
  
 	printf ("Informe a NOTA 1: ");
  	scanf ("%f", & n1);
  	
  	printf ("Informe a NOTA 2: ");
  	scanf ("%f", & n2);
  	
  	printf ("Informe a NOTA 2: ");
  	scanf ("%f", & n3);
  	
  	mf=(n1+n2)/2;

	if (mf>=7 && mf<10){
		
		printf ("Voc� est� APROVADO, sua m�dia final �: %.2f", mf);
		printf ("\nM�dia final superior a 7");
	}
	
	else if (mf<7){
	
		printf ("Voc� est� REPROVADO, sua m�dia final �: %.2f", mf);
		printf ("\nM�dia final n�o superior a 7");

	}
	
	else if (mf==10){
	
		printf ("Parab�ns, Voc� foi APROVADO COM DISTIN��O, sua m�dia final � de %.2f", mf);

	}
		
	else{
		
		printf ("M�dia invalida: %.2f", mf);
		printf ("\nA m�dia das notas excederam o valor 10, ", mf);		
	}
  
}
