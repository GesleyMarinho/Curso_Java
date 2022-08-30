package Modulo_estrutura_Repeticao;

import java.util.Scanner;

public class Ex02 {

    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);

        int a;
        System.out.printf("Digite um valor : ");
        a = ler.nextInt();
        if(a%2 == 0){

            System.out.printf(a +" É Par ");
        }else{
            System.out.printf(a + " É Impar");
        }

    }
}
