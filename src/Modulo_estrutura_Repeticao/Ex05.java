package Modulo_estrutura_Repeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double total = 0;
        int qt = 0;
        int op = 0;
        String cont = "S";

        System.out.printf(" Menu \n" +
                "1- Cacho Quente \n" +
                "2- X-Salada \n" +
                "3- X-Bacon \n" +
                "4- Torrada Silples \n" +
                "5- Refrigerante \n" +
                "Qual a opção desejada : ");
        op = ler.nextInt();


        if (op == 1) {
            System.out.printf("Você escolheu o Cachorro quente ele custa R$4,00\n " +
                    "Qual a quantidade vc deseja : ");
            qt = ler.nextInt();

            total = qt * 4;
        } else if (op == 2) {
            System.out.printf("Você escolheu o x-Salada ele custa R$4,50\n " +
                    "Qual a quantidade vc deseja : ");
            qt = ler.nextInt();

            total = qt * 4.50;
        } else if (op == 3) {
            System.out.printf("Você escolheu o X-bacon ele custa R$5,00\n " +
                    "Qual a quantidade vc deseja : ");
            qt = ler.nextInt();
            total = qt * 5;
        } else if (op == 4) {
            System.out.printf("Você escolheu a Torrada Simples ele custa R$2,00\n " +
                    "Qual a quantidade vc deseja : ");
            qt = ler.nextInt();

            total = qt * 2;
        } else if (op == 5) {
            System.out.printf("Você escolheu o Refrigerante ele custa R$1,50\n " +
                    "Qual a quantidade vc deseja : ");
            qt = ler.nextInt();

            total = qt * 1.50;
        }


        System.out.printf("O valor do seu Pedido é de : R$ " + total);

    }
}
