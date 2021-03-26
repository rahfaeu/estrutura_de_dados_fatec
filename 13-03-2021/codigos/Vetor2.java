import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int n;
        // declaração do objeto scanner da classe Scanner
        Scanner entrada; //objeto <--> referência
        
        // Instanciando o objeto scanner
        entrada = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = entrada.nextInt();

        int v[] = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor da posicao " + i + ": ");
            v[i] = entrada.nextInt();
        }
        
        System.out.print("\nValores digitados:\n");
        for (int i=0; i<n; i++) {
            System.out.printf("posicao %d: %d\n", i, v[i]);
        }

        entrada.close();
    }
}
