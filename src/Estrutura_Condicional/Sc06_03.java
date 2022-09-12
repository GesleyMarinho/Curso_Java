package Estrutura_Condicional;
/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

import java.util.Scanner;

public class Sc06_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantidade de repetição vc deseja : ");
        int n = ler.nextInt();
        int a = 0, b = 0, c = 0;
        int media = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um valor para A: ");
            a = ler.nextInt();
            System.out.printf("Digite um valor para B: ");
            b = ler.nextInt();
            System.out.printf("Digite um valor para C: ");
            c = ler.nextInt();

            media = (a * 2 + b * 3 + c * 5) / n;

        }

        System.out.printf("A média é " + media);
    }
}
