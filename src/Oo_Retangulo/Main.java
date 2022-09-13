package Oo_Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner ler  = new Scanner(System.in);

        Retangulo r;
        r = new Retangulo();
        System.out.printf("Qual a altura do Trinangulo: ");
        r.altura = ler.nextDouble();
        System.out.printf("Qual a largura do Triangulo: ");
        r.largura = ler.nextDouble();

        r.arearetangulo();

        System.out.printf("Relatorio" +r.toString());
    }
}
