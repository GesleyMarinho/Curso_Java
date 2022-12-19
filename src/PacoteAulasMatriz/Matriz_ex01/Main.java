package PacoteAulasMatriz.Matriz_ex01;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digilite um valor para as linhas: ");
        int l = ler.nextInt();
        System.out.printf("Digite um valor para as colunas: ");
        int c = ler.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Entre com os valores : ");
                matriz[i][j] = ler.nextInt();

            }
        }

        System.out.printf("Exibindo os valores da PacoteAulasMatriz.Matriz ");
        for (int i = 0; i < l; i++) {
            System.out.printf("\n");
            for (int j = 0; j < c; j++) {
                System.out.print(" " + matriz[i][j]);
            }
        }
        System.out.printf("\n");
        System.out.printf("Digite um valor para pesquisar na PacoteAulasMatriz.Matriz: ");
        int x = ler.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == x) {
                    System.out.println("Position : " + i + " , " + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("UP: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }

                }

            }
        }

    }
}
