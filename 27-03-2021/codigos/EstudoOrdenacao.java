import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class EstudoOrdenacao {
    
    // exibir um vetor
    static void exibeVetor(int [] v, String msg) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }
    static void preecheVetor(int v[]) {
        Random r = new Random();
        for (int i=0; i<v.length; i++) {
            v[i] = r.nextInt(v.length * 10);
        }
    }

    static void bubbleSort(int v[]) {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continua;
        do {
            System.out.print("digite o tamanho do vetor: ");
            int n = entrada.nextInt();
            int v[] = new int[n];
            
            long inicio = new Date().getTime();
            preecheVetor(v);
            // exibeVetor(v, "vetor gerado");
            
            bubbleSort(v);
            long fim = new Date().getTime();

            System.out.println("\nTempo de ordenação para o tamanho " + n + " = " + ((fim - inicio) / 1000) + "s\n");
            // exibeVetor(v, "vetor ordenado");
            
            // --> leitura do char
            System.out.print("executa novamente? (s/n) ");
            entrada.nextLine();
            continua = entrada.nextLine().toLowerCase().charAt(0);

        } while (continua == 's');
        
        entrada.close();
    }
}
