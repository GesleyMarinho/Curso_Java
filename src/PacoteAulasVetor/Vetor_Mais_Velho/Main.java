package PacoteAulasVetor.Vetor_Mais_Velho;

import java.util.Scanner;
/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
 */

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Qunantos Pessoas será cadastradas: ");
        int n = ler.nextInt();

        int maiorIdade = 0;
        int posicao = 0;

        String Nome[] = new String[n];
        double idade[] = new double[n];

        System.out.println("Preencher os dados");

        for (int i = 0; i < n; i++) {
            ler.nextLine();
            System.out.printf("Qual o nome da Pessoa :  ");
            Nome[i] = ler.nextLine();
            System.out.printf("Qual a idade da Pessoa : ");
            idade[i] = ler.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = (int) idade[i];
                posicao = i;
            }
        }

        System.out.println("O nome é : " + Nome[posicao] + " E a Maior Idade é: " + maiorIdade);
    }
}
