import java.util.Scanner;

public class Exercicio3 {

    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[5];
        int[] vetorDobro = new int[5];

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            vetorOriginal[i] = scanner.nextInt();
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("Valores do segundo vetor (dobro):");
        for (int numero : vetorDobro) {
            System.out.println(numero);
        }
     }
}
