#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, capacidade;
    int * v;
    printf("digite o tamanho do vetor: ");
    scanf("%d", &capacidade);
    v = (int *) malloc (capacidade * sizeof(int));
    printf("onde comeca o vetor: %p\n", v);
    for (i=0; i < 10; i++)
        printf("%p\n", v+i);
    return 0;
}