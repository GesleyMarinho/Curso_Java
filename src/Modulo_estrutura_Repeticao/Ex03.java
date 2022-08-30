package Modulo_estrutura_Repeticao;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
 */

public class Ex03 {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Digite o 1° valor : ");
        a = ler.nextInt();

        System.out.printf("Digite o 2° valor : ");
        b = ler.nextInt();

        if(a% b == 0 || b%a == 0){
            System.out.printf("São Multiplos");
        }else{
            System.out.printf("Não são Multiplos");
        }
        ler.close();
    }
}
