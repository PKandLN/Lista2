import java.util.Scanner;

public class Exercicio15 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número não armazenado: deve ser maior que o anterior.");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");
        for (int numero : vetor) {
            System.out.println(numero);
        }
    }

    
}
