package PacoteAulasVetor.Vetores_Media_Pares;

import java.util.Scanner;
/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */
public class Vetor_Media_Pares {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas posicoes terá o nosso vetor : ");
        int n = ler.nextInt();
        float media=0;
        int cont=0;


        double vect[] = new double[n];

        for(int i=0; i< vect.length;i++){
            vect[i] = ler.nextDouble();
            if(vect[i] %2==0){
                media += vect[i];
                cont++;
            } else if (vect[i] %2==1) {
                media =0;
            }
        }
        float avg = media / cont;

        if(avg>0) {
            System.out.printf(" A media dos núemros pares é de: " + avg);
        }else{
            System.out.printf("Nenhum Número Par Digitado");
        }
    }
}
