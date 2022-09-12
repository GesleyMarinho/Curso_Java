package Estrutura_Condicional;
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

import java.util.Scanner;

public class Sc06_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;
        int x=1;
        System.out.printf("Digite um valor para ser fatorado: ");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        System.out.println("O Fatorial  de " + n + " != " + x);
    }
}
