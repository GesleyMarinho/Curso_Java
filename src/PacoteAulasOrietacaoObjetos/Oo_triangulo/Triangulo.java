package PacoteAulasOrietacaoObjetos.Oo_triangulo;

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public  double areaTriangulo(){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return result;
    }

}
