package PacoteAulasVetor.Vetor_Aluguel_Quartos;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);



        Aluguel[] aluguel = new Aluguel[10];

        System.out.printf("Quantos quartos serão alocados ? ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Rent #" +i+ " : ");
            ler.nextLine();
            System.out.printf("Qual o seu nome ? ");
            String nome = ler.nextLine();
            System.out.printf("Qual o seu email ? ");
            String email = ler.next();
            System.out.printf("Em qual Quarto deseja se Hospedar ? ");
            int quarto = ler.nextInt();

            aluguel[quarto] = new Aluguel(nome, email);

        }

        System.out.println("Quartos Ocupados : ");
        for (int i = 0; i < aluguel.length; i++) {
            if(aluguel[i] != null) {
                System.out.println(i+ " : " + aluguel[i].toString());
            }
        }

    }
}
