import java.util.Scanner;
public class Exercicio8 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        System.out.println("Digite os 5 elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
            vetorC[i] = vetorA[i];
        }

        System.out.println("Digite os 5 elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = scanner.nextInt();
            vetorC[i + 5] = vetorB[i];
        }

        System.out.println("Vetor C (concatenação de A e B):");
        for (int numero : vetorC) {
            System.out.println(numero);
        }
    }
}
