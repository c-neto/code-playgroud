#include <stdio.h>
#include <conio.h>
#include <locale.h>
#include <string.h>

int main (){
	
	setlocale (LC_ALL,"");
	
	char id[20], senha[20];
	
	printf("Digite seu Nome de usu�rio: ");
	gets(id);
	
	setbuf (stdin, NULL);
		
	printf("Digite sua Senha: ");
	gets(senha);
	
	setbuf (stdin, NULL);	

//compara o valor que est� na mem�ria, quando valores iguais, resultado igual a 0, ent�o � feito uma compara��o l�gica
	while ( strcasecmp (id,senha)==0){
		
		printf("\nERRO!!! nome de usu�rio e senha iguais, por favor alterar, pois s� assim o cadastro poder� ser efetuado\n\n");
		
		printf("Digite seu Nome de usu�rio: ");
		scanf("%c", & id);
		
		setbuf (stdin, NULL);
			
		printf("Digite sua Senha: ");
		scanf("%c", & senha);
		
		setbuf (stdin, NULL);
	}
		
	
	printf("\nCadastro efetuado com Sucesso!");
	printf("\n	***ANOTE***\nNome: %s\n", id);	
	printf("Senha: %s", senha);
	
	
}
