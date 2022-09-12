package Estrutura_Condicional;
/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
 */

import java.util.Scanner;

public class Sc06_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.printf("Digite um valor para quantidade de repetção : ");
        int n = ler.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.printf("Qual valor vc gostaria de testar : " + i + "° : ");
            int x = ler.nextInt();
                if (x >= 10 && x <= 20) {
                    a = a + 1;
                } else {
                    b = b + 1;
                }
        }
        System.out.println("Quantas vezes entrou na condição A: " + a);
        System.out.println("Quantas vezes saiu da condiçaõ B: " + b);
    }
}
