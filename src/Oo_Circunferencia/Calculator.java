package Oo_Circunferencia;

public class Calculator {

    public static final double pi = 3.14159;

    public static double circunferencia(double radius) {
        return 2 * pi * radius;
    }

    public static double volume(double radius) {
        return 4 * pi * Math.pow(radius, 3) / 3;
    }
}
