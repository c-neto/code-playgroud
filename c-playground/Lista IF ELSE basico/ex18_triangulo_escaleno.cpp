/*
	Indica se o Triangulo � Escaleno, equilatero..	
*/

#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void)
{
  
	setlocale(LC_ALL,""); 
  
 	float cat_a, cat_b, cat_c;
  
 	printf ("Informe o Cateto A: ");
  	scanf ("%f", & cat_a);
  	
  	printf ("Informe a Cateto B: ");
  	scanf ("%f", & cat_b);
  	
  	printf ("Informe a Cateto C: ");
  	scanf ("%f", & cat_c);
  	
  	if (cat_a+cat_b>cat_c && cat_b+cat_c>cat_a && cat_a+cat_c>cat_b){
  	
  	
		if (cat_a <=0 || cat_b <= 0 || cat_c<= 0)
		{
			printf("Medidas inseridas, n�o indicam um tri�gulo, pois h� cateto com medida menor ou igual a 0");
		}
		
		else 
		{
			
			if (cat_a == cat_b && cat_b == cat_c)
			{
				printf ("Tri�ngulo EQUIL�TERO: Catetos com valor igualit�rios");
			}
			
			else 
			{
			
				if (cat_a == cat_b || cat_a == cat_c || cat_b == cat_c || cat_c == cat_a)
				{
					printf ("Tri�ngulo IS�CELES: quaisquer dois lados iguais");
				}
				
				else 
				{
					if (cat_a != cat_b && cat_a != cat_c && cat_b != cat_c && cat_c != cat_a)
					{
						printf ("Tri�ngulo ESCALENO: tr�s lados diferentes");	
					}
					
					else 
					{
						if (cat_a != cat_b && cat_a != cat_c && cat_b != cat_c && cat_c != cat_a)
						{
							printf ("Tri�ngulo ESCALENO: tr�s lados diferentes");
						}
						
					}		
				}
			}
		}
	
	 }
	 
	 else {
	 	
	 	printf("Medidas inseridas, n�o indicam um tri�gulo");	
	
	 }
}	
	

  
