/*
	5. Dados o n�mero n de alunos de uma turma e suas notas da primeira prova,
	determinar a maior e a menor nota obtidas por essa turma (Nota m�xima = 10
	e nota m�nima = 0), n�o permitindo que sejam digitadas notas inv�lidas.
*/

#include <stdio.h>
#include <conio.h>

int main(){
	
	int id_aluno_maior=0, id_aluno_menor=0, n=0, k=1;
	float nota=0, maior=0, menor=0;
	
	printf("Numeros de Alunos: ");
	scanf("%d", & n);
		
	for (k;k<=n;k++){
		
		printf("Aluno: %d", k);
		printf("\nNota: ");
		scanf("%f", & nota);

		if (k==1){
			maior=nota;
			menor=nota;
		}

		while (nota<0 || nota>10){
			printf("Insira um Valor V�lido (0 a 10):");
			scanf("%f", & nota);
		}
		
		
		if (nota>maior){
			maior=nota;	
			id_aluno_menor=k;
		}
		
		if(nota<menor){
			menor=nota;
			id_aluno_maior=k;
		}
	}
	
	printf("O aluno %d, teve a MENOR nota %.2f \n", id_aluno_menor, menor);
	printf("O aluno %d, teve a MAIOR nota %.2f", id_aluno_maior, maior);
}
