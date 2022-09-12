package Estrutura_Condicional;

import java.util.Scanner;
/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

public class Sc06_06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;
        System.out.printf("Digite um valor: ");
        x = ler.nextInt();

        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                System.out.println(x + " É Divisivel " + i);
            }
        }
    }
}
