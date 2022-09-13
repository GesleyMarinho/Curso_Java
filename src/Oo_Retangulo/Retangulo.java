package Oo_Retangulo;

import java.text.DecimalFormat;

public class Retangulo {

    public double altura;
    public double largura;

    DecimalFormat df = new DecimalFormat();
    public double arearetangulo() {
        double area = 0;
        return area = altura * largura;
    }

    public double perimetroRetangulo() {
        double perimetro = 0;
        return perimetro = 2 * (altura + largura);
    }

    public double diagonalRetangulo() {

        return  Math.sqrt(altura * altura + largura * largura);
    }

    @Override
    public String toString() {
        return " Retangulo{" +
                " altura = " + altura +
                ", largura = " + largura +
                ", Area do Retangulo = " +arearetangulo()+
                ", Perimetro do Retangulo = " + perimetroRetangulo() +
                ", Diamentro do Retangulo = " + df.format(diagonalRetangulo()) +
                '}';
    }
}
