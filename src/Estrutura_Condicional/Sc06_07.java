package Estrutura_Condicional;

import java.util.Scanner;
import static java.lang.Math.pow;
/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo
 */
public class Sc06_07 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.printf("Digite um valor: ");
        x= ler.nextInt();

        for (int i=1;i<=x;i++){
            System.out.println(i+"° Cubo: " + pow(i,2) );
            System.out.println(i+"° Quadrado: " + pow(i,3));
            System.out.println("------------------");
        }
    }
}
