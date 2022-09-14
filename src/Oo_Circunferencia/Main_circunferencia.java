package Oo_Circunferencia;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main_circunferencia {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);



        //Calculator calc = new Calculator();

        System.out.printf("Qual o valor do radio: ");
        double radius = ler.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Valor da Circuferencia " + df.format(Calculator.circunferencia(radius)));
        System.out.println("Valor do Volume: " + df.format(Calculator.volume(radius)));
        System.out.println("Valor do PI: " + df.format(Calculator.pi));
    }
}
