import java.util.Scanner;

public class LerRaio {
    public static void main(String[] args) {
        float r = 0;
        float circunferencia = 0;
<<<<<<< HEAD
        float area = 0;
        float volume = 0;
=======
>>>>>>> e71539dccfd2dd424d49387d70cfa97068eac823

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        r = entrada.nextFloat();
        
        circunferencia = calculaCircunferencia(r);
<<<<<<< HEAD
        System.out.printf("Circunferencia: %.2f\n", circunferencia);

        area = calculaArea(r);
        System.out.printf("Area: %.2f\n", area);

        volume = calculaVolume(r);
        System.out.printf("Volume: %.2f\n", volume);
=======
        System.out.printf("Circunferencia: %.2f", circunferencia);
>>>>>>> e71539dccfd2dd424d49387d70cfa97068eac823

        entrada.close();
    }

    static float calculaCircunferencia(float r) {
        float c = 2 * (float)Math.PI * r;
        return c;
    }
<<<<<<< HEAD

    static float calculaArea(float r) {
        float a = (float)Math.PI * r * r;
        return a;
    }

    static float calculaVolume(float r) {
        float v = (float)4.0/3 * (float)Math.PI * (float)Math.pow(r, 3);
        return v;
    }

=======
>>>>>>> e71539dccfd2dd424d49387d70cfa97068eac823
}
