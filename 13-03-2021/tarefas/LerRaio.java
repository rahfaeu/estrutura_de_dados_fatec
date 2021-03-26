import java.util.Scanner;

public class LerRaio {
    public static void main(String[] args) {
        float r = 0;
        float circunferencia = 0;
        float area = 0;
        float volume = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        r = entrada.nextFloat();
        
        circunferencia = calculaCircunferencia(r);
        System.out.printf("Circunferencia: %.2f\n", circunferencia);

        area = calculaArea(r);
        System.out.printf("Area: %.2f\n", area);

        volume = calculaVolume(r);
        System.out.printf("Volume: %.2f\n", volume);

        entrada.close();
    }

    static float calculaCircunferencia(float r) {
        float c = 2 * (float)Math.PI * r;
        return c;
    }

    static float calculaArea(float r) {
        float a = (float)Math.PI * r * r;
        return a;
    }

    static float calculaVolume(float r) {
        float v = (float)4.0/3 * (float)Math.PI * (float)Math.pow(r, 3);
        return v;
    }

}
