package PacoteAulasVetor.Vetor_Numeros_Pares;

import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantos números vamos digitar ? ");
        int n = ler.nextInt();
        int cont = 0;

        int vect[] = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = ler.nextInt();
        }
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("  " + vect[i]);
                cont++;

            }
        }

        System.out.print("\nQuantidade de números pares é de : " + cont);
    }
}
