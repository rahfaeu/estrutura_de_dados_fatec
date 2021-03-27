import java.util.Scanner;

public class PrograminhaJava {
    public static void main(String[] args) {
        int opcao = 9;
        Scanner entrada = new Scanner(System.in);

        exibeMenu();
        do {
            opcao = entrada.nextInt();
            if(opcao == 1) {
                int n = 0;
                System.out.println("[1] Calcular Média");
                System.out.print("Digite a quantidade de notas: ");
                n = entrada.nextInt();
                float v[] = new float[n];
                preencheVetor(v, n);
                float media = calcularMedia(v, n);
                System.out.printf("Média das notas: %.1f\n", media);
                
                System.out.println("Digite [0] para sair");
                System.out.println("Digite [1] para executar novamente");
                System.out.println("Digite [9] para voltar ao Menu");

                entrada.nextInt();
                opcao = entrada.nextInt();
                
            }
        } while (opcao != 0);
        
        System.out.println("[0] Sair");
        System.out.println("Bye :)");
        entrada.close();
    }

    static void exibeMenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("                  Programinha Java                    ");
        System.out.println("------------------------------------------------------");
        System.out.println("Escolha uma opção:\n");
        System.out.println("[1] Calcular Média");
        System.out.println("[2] Armazenar 50 Números");
        System.out.println("[3] O maior de 2");
        System.out.println("[4] Calcular Média A (aritimética) ou P (Ponderada)");
        System.out.println("[5] Somar algorismos");
        System.out.println("[0] Sair");
        System.out.print("Opção: ");
    }

    static void preencheVetor(float v[], int n) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular Média de Notas:");
        // Ler Conjunto de notas
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite a nota %d de %d: ", i+1, n);
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