package Vetor_Aprovados;

import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
 */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantos alunos vamos adicionar as notas: ");
        int n = ler.nextInt();

        Notas notas[] = new Notas[n];


        for (int i = 0; i < notas.length; i++) {
            ler.nextLine();
            System.out.printf("Nome do aluno: ");
            String nome = ler.nextLine();

            System.out.printf("Primeira nota do aluno: ");
            double nota1 = ler.nextDouble();

            System.out.printf("Segunda nota do aluno: ");
            double nota2 = ler.nextDouble();

            double media = (nota1 + nota2) / 2;

            notas[i] = new Notas(nome, nota1, nota2, media);

        }
        System.out.println("Alunos Aprovados !!!");

        for(int i=0; i< notas.length;i++){
            if(notas[i].getMedia() >= 6 ){
                System.out.println("Nome: " + notas[i].getNome());
            }
        }

    }
}
