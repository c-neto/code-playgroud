#include<stdio.h>
#include<conio.h>
#include<locale.h>

int main (void)

{
	
	float capTanque, medCons, autonomia;

	printf ("Indique a capacidade total do tanque de combust�vel do seu Veiculo em litros:\n" ,setlocale(LC_ALL,""));
	scanf ("%f", & capTanque);

	printf ("\nEm um KM, seu carro gasta quantos litros de Combust�vel: \n");
	scanf ("%f", & medCons);

	autonomia = capTanque*medCons;

	printf ("\nA autonomia do seu ve�culo � de: %.2f", autonomia);
	printf ("KM \nOu seja, seu ve�culo com o tanque cheio, Consiguir� porcorrer em m�dia %.0f KM", autonomia);
	
}
