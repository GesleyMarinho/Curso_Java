package Vetor_Nome_Preco;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            ler.nextLine();
            String name = ler.nextLine();
            double price = ler.nextDouble();
            vect[i] = new Produto(name, price);
        }

        double soma = 0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double avg = soma / n;
        System.out.printf("A média dos preços é " + avg);
    }
}
