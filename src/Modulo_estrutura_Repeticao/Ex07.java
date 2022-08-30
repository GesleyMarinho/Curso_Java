package Modulo_estrutura_Repeticao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        System.out.printf("Digite o 1° valor : ");
        double a = ler.nextDouble();

        System.out.printf("Digite o 2 valor : ");
        double b = ler.nextDouble();
        if ((a > 5 || a < -5) || (b > 5 || b < -5)) {
            System.out.printf("Valores Inválidos");
        } else {

            if (a < 0 && b < 0) {
                System.out.printf("Saída Q3");
            } else if (a < 0 && b > 0) {
                System.out.printf("Sáida Q2");
            } else if (a > 0 && b < 0) {
                System.out.printf("Saída Q4");
            } else if (a > 0 && b > 0) {
                System.out.printf("Saida Q1");
            } else {
                System.out.printf("Origem !!!!");
            }
        }
    }
}
