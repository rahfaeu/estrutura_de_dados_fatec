#include <stdio.h>
#include <stdlib.h>

/*
    3.Implemente uma função que recebe como parâmetro um array de inteiros com n 
    valores e determina o maior elemento do array e o número de vezes que esse 
    elemento ocorreu no array. Por exemplo, para o array {5, 2, 15, 3, 7, 15, 8, 6, 15}, a 
    função deve retornar para a função que a chamou o valor 15 e o número 3, indicando 
    que o número 15 ocorreu 3 vezes. A função deve ser do tipo void.
*/

/* Protótipo da função */
void preeche_vetor(int *vetor, int n);

void maior_elemento(int *vetor, int n, int *pv, int *maior);

int main() {
    int tam = 0;
    
    int m = 0;
    int *pm = (int *) malloc(sizeof(int));
    pm = &m;

    int vezes = 0;
    int *pv = (int *) malloc(sizeof(int));
    pv = &vezes;

    printf("Qual o tamanho do vetor: ");
    scanf("%d", &tam);
    int *v = (int *) malloc(tam * sizeof(int));

    preeche_vetor(v, tam);
    maior_elemento(v, tam, pv, pm);

    printf("\nMaior elemento do vetor: %d\n", m);
    printf("Ocorrencias: %d", vezes);

    return 0;
}

void preeche_vetor(int *vetor, int n) {
    for (int i = 0; i < n; i++) {
        printf("Preencha a posicao %d do vetor: ", i + 1);
        scanf("%d", &vetor[i]);
    }
}

void maior_elemento(int *vetor, int n, int *pv, int *maior) {
    int conte = 0;
    int maior_num = 0;

    for (int i = 0; i < n; i++) {
        if (vetor[i] > maior_num) {
            maior_num = vetor[i];
        }
    }

    for (int i = 0; i < n; i++) {
        if (vetor[i] == maior_num) {
            conte += 1;
        }
    }

    *pv = conte;
    *maior = maior_num;    
}
