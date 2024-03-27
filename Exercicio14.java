import java.util.Scanner;

public class Exercicio14 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int maiorElemento = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[4];
        vetor[4] = maiorElemento;

        System.out.println("Vetor atualizado:");
        for (int numero : vetor) {
            System.out.println(numero);
        }
    }
}
