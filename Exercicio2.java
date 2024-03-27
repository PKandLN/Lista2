import java.util.Scanner;

class Exercicio2 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Análise dos números:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > 0) {
                System.out.println("Número na posição " + i + " é positivo.");
            } else if (numeros[i] < 0) {
                System.out.println("Número na posição " + i + " é negativo.");
            } else {
                System.out.println("Número na posição " + i + " é zero.");
            }
        }
    }

}
