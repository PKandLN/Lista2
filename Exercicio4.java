import java.util.Scanner;

public class Exercicio4 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite um número n:");
        int n = scanner.nextInt();

        System.out.println("Índices dos elementos menores que " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println(i);
            }

    }
}
}