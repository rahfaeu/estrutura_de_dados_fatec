import java.util.Scanner;

public class PrograminhaJava {
    public static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 9;
        // Scanner entrada = new Scanner(System.in);

        exibeMenu();
        do {
            opcao = entrada.nextInt();
            if(opcao == 1) {
                calcularMedia();
                break;          
            }
            else if (opcao == 2){
                armazenarCinquenta();
                break;
            }
            else if (opcao == 3){
                oMaiorDeDois();
                break;
            }
        } while (opcao != 0);
        
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

    static void calcularMedia() {
        System.out.println("[1] Calcular Média");
        System.out.print("Digite a quantidade de notas: ");
        
        int n = 0;
        float media = 0;
        float soma = 0;
        n = entrada.nextInt();
        float v[] = new float[n];

        // Preeche vetor
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite a nota %d de %d: ", i+1, v.length);
            v[i] = entrada.nextFloat();
        }

        // Somar notas
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        // Calcular media
        media = soma / n;
        System.out.printf("Média das notas: %.1f\n", media);
    }

    static void armazenarCinquenta() {
        System.out.println("[2] Armazenar 50 Números");
        int v[] = new int[50];

        int valor = 100;

        // Preeche vetor        
        for (int i = 0; i < v.length; i++) {
            valor += 1;
            v[i] = valor;
        }

        for (int i=0; i<v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }

    static void oMaiorDeDois() {
        System.out.println("[3] O maior de 2");
        int n1 = 0;
        int n2 = 0;

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        int maior = n1 > n2 ? n1 : n2;
        System.out.printf("O maior número é: %d\n", maior);
    }

    static void mediaAritOuPond() {
        System.out.println("[4] Calcular Média A (aritimética) ou P (Ponderada)");
        
    }
}