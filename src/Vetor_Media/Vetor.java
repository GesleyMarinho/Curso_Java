package Vetor_Media;

import java.util.Scanner;

public class Vetor {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        int n  = ler.nextInt();
        double soma =0;
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){

            vect[i] = ler.nextDouble();

        }

        for(int i=0; i<n;i++){
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.printf("A Média é "+ avg);

    }
}
