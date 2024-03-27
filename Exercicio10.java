import java.util.Scanner;

public class Exercicio10 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        System.out.println("Vetor B (invertido):");
        for (int numero : vetorB) {
            System.out.println(numero);
        }
    }
}
