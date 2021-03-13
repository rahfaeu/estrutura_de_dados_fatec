#include <stdio.h>
#include <stdlib.h>

int * devolve_vetor(int);

int main() {
    int *x;
    x = devolve_vetor(10);
    if (x != NULL) {
        // Processamento dos valores em v
    free(x);
    }
    
    x = devolve_vetor(100);
    if (x != NULL) {
        // Processamento dos valores em v
    free(x);
    }
    x = NULL;    
    return 0;

}

int * devolve_vetor(int n) {
    int *v = (int *) malloc (n * sizeof(int));
    return v;
}