#include <stdio.h>
#include <stdlib.h>

int main() {
    // int v[10];
    int * v;
    // Todo vetor é um ponteiro
    printf("tamanho alocado para v = %d\n", sizeof(v));
    printf("Onde comeca o vetor: %p\n", v);
    v = (int *) malloc(1000000*sizeof(int));
    return 0;
}