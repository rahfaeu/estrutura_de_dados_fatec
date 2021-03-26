import java.util.Scanner;

public class LerRaio {
    public static void main(String[] args) {
        float r = 0;
        float circunferencia = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        r = entrada.nextFloat();
        
        circunferencia = calculaCircunferencia(r);
        System.out.printf("Circunferencia: %.2f", circunferencia);

        entrada.close();
    }

    static float calculaCircunferencia(float r) {
        float c = 2 * (float)Math.PI * r;
        return c;
    }
}
