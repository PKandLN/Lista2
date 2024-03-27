import java.util.Scanner;

public class Exercicio6 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double[] pesos = new double[5];

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Digite os 5 pesos correspondentes:");
        for (int i = 0; i < 5; i++) {
            pesos[i] = scanner.nextDouble();
        }

        double somaPonderada = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaPonderada / somaPesos;
        System.out.println("Média ponderada: " + mediaPonderada);
    }
    }

