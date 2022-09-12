package Estrutura_Condicional;
/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Scanner;

public class Sc06_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 0;
        int a = 0;
        int b = 0;

        System.out.printf("Quantidade de repetição: ");
        n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um valor para A: ");
            a = ler.nextInt();
            System.out.printf("Digite um valor para B: ");
            b = ler.nextInt();

            if (b == 0) {
                System.out.printf("Não é possível dividir por zero");
            } else {
                int div = a / b;
                System.out.printf("A divisão é " + div);
            }
        }
    }
}
