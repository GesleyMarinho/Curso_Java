package PacoteAulasOrietacaoObjetos.Oo_triangulo;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.printf("Entre com os valores Trinagulo X :");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();

        System.out.printf("Entre com os valores Trinagulo Y :");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();

       double areaX = x.areaTriangulo();
       double areaY = y.areaTriangulo();

        DecimalFormat df = new DecimalFormat();

        System.out.println("Triangulo X area " + df.format(areaX));
        System.out.println("Triangulo Y area   " + df.format(areaY));

        if (areaX > areaY) {
            System.out.println("A maior Area é do trinagulo X");
        } else {
            System.out.println("A maior Area é do trinagulo Y");
        }
    }
}
