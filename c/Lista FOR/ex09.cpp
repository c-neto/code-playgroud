#include <stdio.h>
#include <stdio.h>
#include <locale.h>

int main()
{
	setlocale (LC_ALL,"");
		    
    int ni, nf;
    
	printf("N�mero inicial: ");
	scanf ("%d", & ni);
	
	printf("N�mero final: ");
	scanf ("%d", & nf);
	
	for (ni ; ni<=nf ; ni++){
		
		printf("%d\n", ni);
		
	}
	
}
