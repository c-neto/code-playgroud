/*
	10. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto
	mais barato
*/

#include<stdio.h>
#include<conio.h>
#include<locale.h>

int main (void)

{
	int n1,	n2, n3;

	setlocale(LC_ALL,"");
		
	printf ("Informe o Pre�o do Produto A: R$ ");
	scanf ("%d", & n1);
	
	printf ("Informe o Pre�o do Produto B: R$ ");
	scanf ("%d", & n2);
	
	printf ("Informe o Pre�o do Produto C: R$ ");
	scanf ("%d", & n3);

	if (n1 > n2 && n2 > n3){
		
		printf ("Voc� deve comprar o Produto C, pois ele � o mais barato \n em rela��o aos demais produtos citados: ");
		printf ("%d ", n3);
		printf (" R$ \n");

	}
	
	else if (n1 > n3 && n3 > n2){
	
		printf ("Voc� deve comprar o Produto B, pois ele � o mais barato em rela��o aos demais produtos citados: ");
		printf ("%d ", n2);
		printf (" R$ \n");
		
	}
	
		
	else if (n2 > n3 && n3 > n1){
		
		printf ("Voc� deve comprar o Produto A, pois ele � o mais barato em rela��o aos demais produtos citados: ");
		printf ("%d ", n1);
		printf (" R$ \n");
		
	}
	

	else if (n2 > n1 && n1 > n3){
	
		printf ("Voc� deve comprar o Produto C, pois ele � o mais barato em rela��o aos demais produtos citados: ");
		printf ("%d ", n3);
		printf (" R$ \n");
	}
	
	
	else if (n3 > n2 && n2 > n1){
		
		printf ("Voc� deve comprar o Produto A, pois ele � o mais barato em rela��o aos demais produtos citados: ");
		printf ("%d ", n1);
		printf (" R$ \n");
		
	}
	

	else if (n3 > n1 && n1 > n2){
	
		printf ("Voc� deve comprar o Produto B, pois ele � o mais barato em rela��o aos demais produtos citados: ");
		printf ("%d ", n2);
		printf (" R$ \n");
		
	}
	

}
