import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 0;
        String resultado = "";
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();
        
        if (numero % 2 == 0) {
            resultado = "é Par.";
        }
        else {
            resultado = "é Impar.";
        }

        System.out.printf("O número %d %s\n", numero, resultado);
        
        entrada.close();
    }
}
