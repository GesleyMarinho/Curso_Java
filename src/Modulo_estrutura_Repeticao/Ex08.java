package Modulo_estrutura_Repeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.printf("Qual o seu salario : ");
        double salario = ler.nextDouble();

        double vlImpostos = 0;

        if (salario < 2000) {
            System.out.printf("Isento de contribuição");
            salario = 0.0;
        } else if (salario <= 3000) {

            vlImpostos = ((salario - 2000)/100) * 0.8;

        } else if (salario <= 4500) {

            vlImpostos = (salario - 3000) * 0.18 + 100 * 0.8;

        } else {
            vlImpostos  = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 100 * 0.8;
        }

        System.out.printf("O valor dos imposto é de R$" + vlImpostos);
    }
}
