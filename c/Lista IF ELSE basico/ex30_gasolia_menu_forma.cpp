/*
	Formata��o, litros de gasolina... desconto... menu...
*/

#include<stdio.h>	
#include<conio.h>
#include<locale.h>

int main (){

	setlocale (LC_ALL,"");

	printf("O Posto Tabajara est� com uma promo��o de carnes que � imperd�vel. \nConfira:\n\n");	
	
	float desc , li_2, li_1,  li, conta;
	char pcento = '%', val_op;
	

	printf("Op��o	At� 20 litros 		Acima de 20 litros\n");
	printf ("	(3%c desconto)	    	   (5%c desconto)	\n\n", pcento, pcento);
	printf("|A|   Alcool		R$ 1,90 Litro\n"	);
	printf("|G|   Gasolina		R$ 2,50 litro Kg	");

	inicio:
		
	printf("\n\nDigite a inicial referente ao combust�vel desejado: ");
	scanf("%c", & val_op);
	
//op xxx	
	if (val_op!='a' && val_op!='A' && val_op!='g' && val_op!='G')	{
	
		printf ("Op��o Inv�lida!!!");
		goto inicio;
	}	
	
//op1	
	else if (val_op=='A' || val_op=='a'){
	
		printf ("\n\nVoc� escolheu a op��o |A| = �lcool\n\n");
		printf ("Digite a quantidade em Litros: ");	
		scanf ("%f", & li);

		li_1=li*1.90;
	
		if (li<=20){
			
			desc = (li_1*3)/100;
			
		
		}
		
		else {
			
			desc = (li_1*5)/100;
			
		}
		
	}

	else if (val_op=='G' || val_op=='g'){
	
		printf ("\n\nVoc� escolheu a op��o |G| = Gasolina\n\n");
		printf ("Digite a quantidade em Litros: ");	
		scanf ("%f", & li);

		li_2=li*2.50;
	
		if (li<=20){
			
			desc = (li_2*4)/100;
			
		
		}
		
		else {
			
			desc = (li_2*6)/100;
			
		}
		
	}
	
	
	conta = li_1+li_2-desc;
		
	printf("\nConta Final: ................ R$: %.2f\n", conta);				
	
}
