package Vetor_Negativos;

import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

 */

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        double vect[] = new double[n];
        for(int i=0;i< vect.length;i++){
            vect[i] = ler.nextInt();
        }
        System.out.println("Número Negativos : " );
        for (int i=0; i< vect.length;i++){
            if(vect[i] < 0){

                System.out.println(""+vect[i]);
            }
        }

    }
}
