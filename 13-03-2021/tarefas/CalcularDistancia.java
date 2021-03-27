import java.util.Scanner;

public class CalcularDistancia {
    public static void main(String[] args) {
        float x1 = 0, x2 = 0;
        float y1 = 0, y2 = 0;
        float distancia = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a coordenada de x1: ");
        x1 = entrada.nextFloat();
        System.out.print("Digite a coordenada de y1: ");
        y1 = entrada.nextFloat();
        System.out.print("Digite a coordenada de x2: ");
        x2 = entrada.nextFloat();        
        System.out.print("Digite a coordenada de y2: ");
        y2 = entrada.nextFloat();

        distancia = calcucaDistancia(x1, x2, y1, y2);
        System.out.printf("Distancia:%.2f\n", distancia);
        
        entrada.close();
    }

    static float calcucaDistancia(float x1, float x2, float y1, float y2) {
        float d = (float)Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
        return d;
    }
}
