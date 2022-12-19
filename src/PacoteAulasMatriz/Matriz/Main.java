package PacoteAulasMatriz.Matriz;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com um valor ? ");
        int n = ler.nextInt();
        int cont = 0;
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = ler.nextInt();
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.println("Exibindo a PacoteAulasMatriz.Matriz");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + mat[i][j]);
            }
        }
        System.out.printf("\n");
        System.out.println("Exibindo a Diagonal da PacoteAulasMatriz.Matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.printf(" " + mat[i][j]);
                }
            }
        }
        System.out.printf("\n");
        System.out.printf("Quantidade números negativos: " + cont);
    }
}
