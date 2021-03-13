#include <stdio.h>

int * devolve_vetor(int);

int main() {
    int *x;
    // x está recebendo o endereço(referência) de uma variável local de uma função. Warnning
    x = devolve_vetor(10);
    return 0;

}

int * devolve_vetor(int n) {
    int v[n];
    return v;
}