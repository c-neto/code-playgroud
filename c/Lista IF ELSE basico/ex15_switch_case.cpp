/*
	15. Fa�a um Programa que tendo como dados de entrada o pre�o de custo de um..
*/

#include<stdio.h>
#include<conio.h>
#include<locale.h>

int main (void)

{
	setlocale(LC_ALL,"");
		
	int cod_origem;
	float preco;
		
	printf ("Digite o Pre�o do Produto: R$ ");
	scanf ("%f", & preco);
	
	printf ("C�digo de Origem: ");
	scanf ("%d", & cod_origem);
	
	  switch ( cod_origem )
  	{
     case 1 :
		printf ("Origem do Produto: ");
		printf ("Sul\n");
		printf ("Pre�o R$: %.2f", preco);
     break;
 
     case 2 :
		printf ("Origem do Produto: ");
		printf ("Norte\n");
		printf ("Pre�o R$: %.2f", preco);       
     break;
 
     case 3 :
       	printf ("Origem do Produto: ");
		printf ("Leste\n");
		printf ("Pre�o R$: %.2f", preco); 
     break;
 
     case 4 :
        printf ("Origem do Produto: ");
		printf ("Oeste\n");
		printf ("Pre�o R$: %.2f", preco); 
     break;
 
     case 5 :
        printf ("Origem do Produto: ");
		printf ("Nordeste\n");
		printf ("Pre�o R$: %.2f", preco);         
        
     break;
 
     case 6 :
        printf ("Origem do Produto: ");
		printf ("Nordeste\n");
		printf ("Pre�o R$: %.2f", preco);  
     break;
 
     case 7 :
        printf ("Origem do Produto: ");
   		printf ("Centro-Oeste\n");
		printf ("Pre�o R$: %.2f", preco);  
     break;
     
	 case 8 :
        printf ("Origem do Produto: ");
   		printf ("Centro-Oeste\n");
		printf ("Pre�o R$: %.2f", preco);  
     break;     
 
     default :
        printf ("Origem do Produto: ");
   	 	printf ("Importado\n");
		printf ("Pre�o R$: %.2f", preco);  
	  
 	}
 
		
}
	

