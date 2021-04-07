
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
            else if (opcao == 4){
                float v[];
                v = new float[3];
                char letra;

                System.out.println("Informe as notas e o tipo de calculo:");
                System.out.println("[A] Média Aritimética");
                System.out.println("[P] Média Ponderada");
                for (int i = 0; i < v.length; i++) {
                    System.out.printf("Digite a %dª nota: ", i+1);
                    v[i] = entrada.nextFloat();
                }
                System.out.printf("Digite P ou A nota: ");
                letra = entrada.next().toLowerCase().charAt(0);

                while (letra != 'a' & letra != 'p') {
                    System.out.println("Letra inválida, tente novamente!");
                    System.out.printf("Digite P ou A nota: ");
                    letra = entrada.next().toLowerCase().charAt(0);
                }
                
                mediaAP(v, letra);
                break;
            }
            if(opcao == 5) {
                System.out.printf("Digite um número inteiro maior que 0: ");
                int n = entrada.nextInt();
                while (n < 1) {
                    System.out.printf("Digite um número inteiro maior que 0: ");
                    n = entrada.nextInt();
                }                
                somaAlgorismos(n);
                break;          
            }
        } while (opcao != 0);
        
        System.out.println("\nBye :)");
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

    static void mediaAP(float v[], char letra) {
        float[] pesos = {5, 3, 2};
        float media = 0;
        float somaNotas = 0;
        float somaPesos = 0;
        if (letra == 'a') {
            for (int i = 0; i < v.length; i++) {
                somaNotas += v[i];
            }
            media = somaNotas / v.length;
            System.out.printf("\nA Média Aritimética é: %.1f\n", media);
        }
        else {
            for (int i = 0; i < v.length; i++) {
                somaNotas += pesos[i] * v[i];
                somaPesos += pesos[i];
            }
            media = somaNotas / somaPesos;
            System.out.printf("\nA Média Ponderada é: %.1f\n", media);
        }        
    }

    static void somaAlgorismos(int num) {
        int soma = 0;
        int digito = 0;
        while (num > 0) {
            digito = num % 10;
            num /= 10;
            soma += digito;
        }
        System.out.printf("A soma dos algorismos é: %d", soma);
    }
}