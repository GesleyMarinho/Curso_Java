package Vector_Soma;

import java.util.Scanner;
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor

 */
public class Main_Soma {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        double vect[] = new double[n];

        for (int i=0;i< vect.length;i++){
            vect[i] = ler.nextInt();
        }

        System.out.printf("Valores : ");
        for (int i=0; i< vect.length;i++){
            System.out.print(" " + vect[i] );
        }
        double soma =0;
        for(int i =0; i< vect.length;i++){
            soma += vect[i];
        }

        double avg = soma / n;
        System.out.printf("\n");
        System.out.println("A Soma é : "+ soma);
        System.out.println("A Média é: " +avg);

    }
}
