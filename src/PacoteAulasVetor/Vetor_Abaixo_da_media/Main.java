package PacoteAulasVetor.Vetor_Abaixo_da_media;

import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas Posições tetá nosso vetor :");
        int n = ler.nextInt();
        double media =0;

        double vect[] = new double[n];

        for(int i=0;i< vect.length;i++){
            vect[i] = ler.nextDouble();
            media += vect[i];
        }

        double avg = media / n;
        System.out.println("A média é de :" + avg);
        System.out.println("Elementos Abaixo da Média ");

        for (int i=0; i< vect.length;i++){
            if(vect[i] < avg){
                System.out.println(" "+ vect[i]);
            }
        }

    }
}
