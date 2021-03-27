import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();
        int resultado = 0;

        if (numero != 0) {
            System.out.println("Tabuada do número: " + (numero));
            for (int i = 0; i <= 10; i++) {
                resultado = numero * i;
                System.out.printf("%d x %d = %d\n", numero, i, resultado);
            }  
        }
        else {
            System.out.println("A tabuada de " + numero + " é sempre " + numero);
        }        

        entrada.close();
    }
}
