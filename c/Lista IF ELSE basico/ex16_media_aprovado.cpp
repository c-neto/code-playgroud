/*
	16. Altere o programa que calcula a m�dia do aluno, e mostre a mensagem de
*/

#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void)
{
  
	setlocale(LC_ALL,""); 
  
 	float n1, n2, mf;
  
 	printf ("Informe a NOTA 1: ");
  	scanf ("%f", & n1);
  	
  	printf ("Informe a NOTA 2: ");
  	scanf ("%f", & n2);
  	
  	mf=(n1+n2)/2;

	if (mf>=0 && mf<=3){
		
		printf ("Parab�ns, Voc� est� REPROVADO, sua m�dia final � de %.2f", mf);
		printf ("\nM�dia final n�o foi superior a 5", mf);
	}
	
	else if (mf>3 && mf<7){
	
		printf ("Voc� est� EM EXAME, sua m�dia final � de %.2f", mf);
		printf ("\n ... ", mf);

	}
	
	else if (mf>=7 && mf<=10){
	
		printf ("Parab�ns, Voc� est� APROVADO, sua m�dia final � de %.2f", mf);
		printf ("\n ... ", mf);

	}
		
	else{
		
		printf ("M�dia invalida: %.2f", mf);
		printf ("\nA m�dia das notas excederam o valor 10, ", mf);		
	}
  
}
