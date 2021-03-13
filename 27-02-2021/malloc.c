#include <stdio.h>
#include <stdlib.h>

int main() {
    int * pi;
    float * pf;
    char * pc;
    printf("valor inicial de pi: %p\n", pi);
    // pi = malloc(4); // Aloca hard-coded
    
    /*
        Aloca espaço na região de alocação para armazenar um inteiro dinamicamente,
        devolvendo o endereço para a variável pi
    */
    pi = (int *)malloc(sizeof(int));
    printf("valor atual de pi: %p\n", pi);

    // Fazer o cast para o tipo específico ((float *)), pois o mallos() devolve um ponteiro genérico
    pf = (float *)malloc(sizeof(float));

    pc = (char *)malloc(sizeof(char));

}