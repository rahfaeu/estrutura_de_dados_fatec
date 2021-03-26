import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        float cel = 0;
        float fah = 0;

        System.out.println("Digite a temperatura em Celsius:");
        Scanner entrada;
        entrada = new Scanner(System.in);
        cel = entrada.nextFloat();
        fah = 9 * cel / 5 + 32;

        System.out.printf("Fahrenheit: %.1f", fah);

        entrada.close();
    }
}