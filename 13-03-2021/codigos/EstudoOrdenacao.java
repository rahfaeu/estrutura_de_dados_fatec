import java.util.Random;
import java.util.Scanner;

public class EstudoOrdenacao {
    
    // exibir um vetor
    static void exibeVetor(int [] v, String msg) {
        System.out.println("\n" + msg + "\n");
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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continua;
        do {
            System.out.print("digite o tamanho do vetor: ");
            int n = entrada.nextInt();
            int v[] = new int[n];

            exibeVetor(v, "vetor zerado");
            preecheVetor(v);
            exibeVetor(v, "vetor gerado");
            
            // --> leitura do char
            System.out.print("executa novamente? (s/n) ");
            entrada.nextLine();
            continua = entrada.nextLine().toLowerCase().charAt(0);

        } while (continua == 's');
        
        
        entrada.close();
    }
}
