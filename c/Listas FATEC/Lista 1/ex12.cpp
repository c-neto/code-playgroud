/*
	
	12. Um matem�tico italiano da idade m�dia conseguiu modelar o ritmo de
	crescimento da popula��o de coelhos atrav�s de uma seq��ncia de n�meros
	naturais que passou a ser conhecida como sequencia de Fibonacci. O n-�simo
	n�mero da seq��ncia de Fibonacci Fn � dado pela seguinte f�rmula de
	recorr�ncia:
	Fa�a um programa que, dado n, calcula Fn.

*/

#include <stdio.h>
#include <conio.h>

int main(){

	int k=1,n=0,a=0,b=1,c=1;

	scanf("%d", &n);

	for (k; k <= n; k++){

		printf("F(%d) = %d\n", k ,c);
		c = a+b;
		a=b;
		b=c;
		

	}
	return 0;
}
