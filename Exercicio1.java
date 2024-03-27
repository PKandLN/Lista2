import java.util.Scanner;

public class Exercicio1 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        double media = soma / 5.0;
        System.out.println("Média: " + media);

        System.out.println("Valores menores que a média:");
        for (int numero : numeros) {
            if (numero < media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores iguais à média:");
        for (int numero : numeros) {
            if (numero == media) {
                System.out.println(numero);
            }
        }

        System.out.println("Valores superiores à média:");
        for (int numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }



    }

}

}
