#include<stdio.h>
#include<conio.h>
#include <locale.h> //setlocale(LC_ALL,""); 

int main (void){
	
	setlocale(LC_ALL,""); 
	
	int k, n, s=0, resto ,par=0, impar=0;
	
	for (k=1 ; k<=10 ; k++){
	
		printf("Digite um N�mero Inteiro: ");
		scanf("%d", & n);	
		
		s=s+n;
	}

	for (k=0 ; k<=s ; k+=2) {
			
		par=par+1;
			
	}
	
	for (k=1 ; k<=s ; k+=2) {
			
		impar=impar+1;
			
	}
	
	
	printf("\nSOMA: %d", s);
	printf("\nQuantidades de n�meros PARES: %d", par);
	printf("\nQuantidades de n�meros IMPARES: %d", impar);
		
	
	return 0;
}
