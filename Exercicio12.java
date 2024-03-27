
public class Exercicio12 {

    public static void executar(){

        int[] vetor = {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12};
        int produtoParesPositivos = 1;

        for (int numero : vetor) {
            if (numero > 0 && numero % 2 == 0) {
                produtoParesPositivos *= numero;
            }
        }

        System.out.println("Produto dos elementos pares positivos: " + produtoParesPositivos );
    }
    }


