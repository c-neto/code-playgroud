/*
	strcopy - copia uma string em outra variavel
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char nome1[100], nome2[100];

    printf("Digite o nome: ");
    gets(nome1);
    setbuf(stdin,NULL);

    strcpy(nome2,nome1); //strcpy(onde ser� copiado, o que ser� copiado);

    printf("Vetor 2: %s\n\n", nome2);
   
}
