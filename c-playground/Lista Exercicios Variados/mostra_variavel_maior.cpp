/*
	Vari�vel Maior
*/

#include<stdio.h>
#include<conio.h>
#include <locale.h> //necess�rio para usar setlocale

int main (void)
{
  
	setlocale(LC_ALL,"");
	int a, b;
  
  	printf ("Informe um Valor: ");
  	scanf ("%d", & a);
  
 	printf ("informe outro Valor: ");
    scanf ("%d", & b);
    
	if (a>b){
		
		printf ("O Valor maior idicado �: %d", a);
		
	}
	
	else{
		
		printf ("O Valor maior idicado �: %d", b);
		
	}
  
}
