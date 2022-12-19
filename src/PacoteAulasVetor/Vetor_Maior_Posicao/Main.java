package PacoteAulasVetor.Vetor_Maior_Posicao;

import java.util.Scanner;
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).

 */
public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantos números vamos armazenar: ");
        int n = ler.nextInt();
        float maior=0;
        int posicao=0;

        float vect[] = new float[n];

        for (int i=0; i< vect.length;i++){
            vect[i] = ler.nextFloat();
        }

        for(int i=0; i< vect.length;i++){
            if(vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }
        System.out.println("O maio valor é:  "+ maior );
        System.out.println("E a sua posição é: "+ posicao);

    }
}
