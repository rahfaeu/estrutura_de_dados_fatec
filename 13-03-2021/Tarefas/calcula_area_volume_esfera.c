#include <stdio.h>
#include <math.h>

/*
    2.Implemente uma função que calcula a área da superfície e o volume
    de uma esfera de raio r. Essa função deve obedecer ao protótipo:
    
    voidcalc_esfera(floatr, float*area, float*volume);

    A área da superfície e o volume são dados, respectivamente, por:
        A = 4 ∗p ∗R2
        V = 4/3 ∗p ∗R3
*/

/* Protótipo da função */
void calc_esfera(float r, float *area, float *volume);

int main() {
    float raio = 0;
    float a = 0;
    float v = 0;
    float *pa;
    float *pv;

    pa = &a;
    pv = &v;

    printf("Digite o valor do raio: ");
    scanf("%f", &raio);

    calc_esfera(raio, pa, pv);

    printf("Area da esfera: %.1f\n", a);
    printf("Volume da esfera: %.1f", v);

    return 0;
}

void calc_esfera(float r, float *area, float *volume) {
    float pi = 3.14159;
    *area = 4.0 * pi * pow(r, 2);
    *volume = 4.0/3 * pi * pow(r, 3);
}