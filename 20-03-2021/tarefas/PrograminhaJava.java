import java.util.Scanner;

public class PrograminhaJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        
        System.out.print("Digite a quantidade de notas: ");
        n = entrada.nextInt();
        float  v[] = new float[n];
                
        preencheVetor(v);
        float media = calcularMedia(v, n);
        System.out.printf("Média das notas: %.1f\n", media);

        entrada.close();
    }

    static void preencheVetor(float v[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular Média de Notas:");
        // Ler Conjunto de notas
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite a nota %d de %d: ", i+1, v.length);
            v[i] = entrada.nextFloat();
        }
        entrada.close();
    }

    static float calcularMedia(float v[], int n) {
        float media = 0;
        float soma = 0;
        
        // Somar notas
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        // Calcular media
        media = soma / n;
        return media;
    }
}