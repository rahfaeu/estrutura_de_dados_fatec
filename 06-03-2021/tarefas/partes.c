#include <stdio.h>
#include <stdlib.h>

/*
    1.Implemente uma função que recebe um número real passado valor,
    retorne a parte inteira e a parte fracionaria desse número.
    Depois, implemente a função mainque chama essa função.Protótipo:

    void partes (float num, int *inteiro, float *fracionaria);
*/

/* Protótipo da função */
void partes(float num, int *inteiro, float *fracionaria);

int main() {

float num;
int *pi;

pi = (int *) malloc(sizeof(int));

float *pf;
pf = (float *) malloc(sizeof(float));

int parte_inteira;
float parte_fracionada;

pi = &parte_inteira;
pf = &parte_fracionada;

printf("Digite um numero real: ");
scanf("%f", &num);

partes(num, pi, pf);

printf("Numero real: %.4f\n", num);
printf("Parte inteira: %d\n", parte_inteira);
printf("Parte fracionada: %.4f\n", parte_fracionada);

return 0;

}

void partes(float num, int *inteiro, float *fracionaria) {
    *inteiro = (int) num;
    *fracionaria = num - ((int) num);
}