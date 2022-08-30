package Modulo_estrutura_Repeticao;

import java.util.Scanner;
//01 -Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Ex01 {
    public static void  main (String[] args){

        Scanner ler = new Scanner(System.in);
        int a;
        System.out.printf("Digite um valor : ");
        a = ler.nextInt();

        if(a>=0){
            System.out.printf("Verdadeiro");
        }else {
            System.out.printf("Falso");
        }

    }
}
