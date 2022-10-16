package Vetor_01;

import java.util.Scanner;

public class Vetor {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        int n  = ler.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){

            vect[i] = ler.nextDouble();

        }


    }
}
