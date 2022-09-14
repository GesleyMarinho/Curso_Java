package Oo_dolares;

import java.util.Scanner;

public class Main_dolares {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Qual o valor do Dolar no momento: ");
        double dollar = ler.nextDouble();

        System.out.printf("Quantos Dolares vc deseja comprar: ");
        double qtComprar = ler.nextDouble();

        System.out.println("O Valor a pagar Bruto é de: " + ConversaoDolares.precoPagar(dollar,qtComprar));
        System.out.println("O valor menos os Impostos é de : "+ ConversaoDolares.precoDollarSemImpostos(dollar,qtComprar));

    }
}
