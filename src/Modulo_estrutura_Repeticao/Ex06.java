package Modulo_estrutura_Repeticao;

import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a;
        System.out.printf("Digite um valor para Saber em qual intervalo ele se Encontra : ");
        a = ler.nextInt();


        if (a <= 0 || a > 100) {
            System.out.printf("Ele NÃO se encontra  em nenhuma faixa \n" +
                    "Valor digitado foi : " + a);
        } else if (a <= 25) {

            System.out.printf("Ele se encontra na 1° faixa (0,25)\n" +
                    "Valor digitado foi : " + a);
        } else if (a <= 50) {
            System.out.printf("Ele se encontra na 2° faixa (25,50)\n" +
                    "Valor digitado foi : " + a);
        } else if (a <= 75) {
            System.out.printf("Ele se encontra na 3° faixa (50,75)\n" +
                    "Valor digitado foi : " + a);
        } else if (a <= 100) {
            System.out.printf("Ele se encontra na 4° faixa (75,100)\n" +
                    "Valor digitado foi : " + a);
        }
    }
}
