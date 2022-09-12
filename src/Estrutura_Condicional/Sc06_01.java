package Estrutura_Condicional;
import java.util.Scanner;
 /*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o caso.
 */

public class Sc06_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite um valor para X: ");
        int x = ler.nextInt();

        for (int i = 0; i <= x; i++) {
            if(i%2==0) {
                System.out.println("Pares " + i);
            }
        }

        for (int i = 0; i <= x; i++) {
            if(i%2==1) {
                System.out.println("Impares " + i);
            }
        }
    }
}
