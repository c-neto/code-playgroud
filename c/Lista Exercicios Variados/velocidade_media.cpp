/*
	Velocidade m�dia de uma caixa
*/

#include<stdio.h>
#include<conio.h>
#include <locale.h>

int main (void)
{
		
	float velocidade, distancia, tempo, min;
	
	printf ("Indique a Velocidade M�dia em KM/h: ",setlocale(LC_ALL,""));
	scanf ("%f", & velocidade);

	printf ("Indique a Dist�ncia em KM: ");
	scanf ("%f", & distancia);

	tempo = distancia/velocidade;

	min=60*tempo;

	if (min >60){

 		printf("Tempo Estimado: ");
 		printf("%.2f", tempo);
 		printf("Horas"); 

	}

	else{

 		printf("Tempo Estimado: ");
 		printf("%.2f", min);
 		printf(" Minutos"); 

	} 
}
