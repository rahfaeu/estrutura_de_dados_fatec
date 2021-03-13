import java.util.Scanner;

public class EntradaSaida {
    public static void main(String args[]) {
        int i = 2, j = 3;
        int v[];
        double d = 0.75;

        // Scanner entrada = new Scanner(System.in);

        Scanner entrada; // declarando um objeto da classe Scanner
        entrada = new Scanner(System.in); // instanciando um objeto da classe Scanner

        System.out.printf("soma = %.2f\n", (i + d));
        System.out.println("soma = " + i+d);
        System.out.print("multiplicação = " + i * j);

        System.out.print("digite um inteiro: ");
        i = entrada.nextInt();

        System.out.print("\ndigite um double: ");
        d = entrada.nextDouble();

        System.out.println("digite o tamanho do vetor:");
        j = entrada.nextInt();

        v = new int[j];

        System.out.println("Digite os valores do vetor:");
        for (i=0; i < v.length; i++) {
            v[i] = entrada.nextInt();
        }

        for (i=0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
