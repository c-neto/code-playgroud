#include<stdio.h>
#include<conio.h>
#include<locale.h>

int main (void)

{

	float r, pi, d, a, r2, per;

	setlocale(LC_ALL,"");

	pi = 3.141516;
	
	
	printf ("Indique o raio do C�rculo em CM: ");
	scanf ("%f", & r);

	r2 = r*r;
	a = pi*r2;
	d = r+r;
	per = 2*pi*r;

	printf ("�rea do C�rculo: %.2f", a);
	printf (" CM�");
	printf ("\nDi�metro: %.2f", d);
	printf (" CM");
	printf ("\nPer�metro: %.2f", per);
	printf (" CM");


}
