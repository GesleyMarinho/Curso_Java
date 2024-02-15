package Heranca_contrado.EX01.Program;

import Heranca_contrado.EX01.Entities.Circulo;
import Heranca_contrado.EX01.Entities.Retangulo;
import Heranca_contrado.EX01.Interface_Abstract.AbstractShape;
import PacoteHeranca_Polimorfismo.MetodosAbstrados.Color;

public class Main {
    public static void main(String[] args) {

        AbstractShape ab1 = new Circulo(Color.Blue, 2.0);
        AbstractShape ab2 = new Retangulo(Color.Red, 3.0, 4.0);

        System.out.println("A cor do Circulo é: " + ab1.getColor());
        System.out.println("Rentagulo área é: " + String.format("%.3f", ab1.area()));

        System.out.println("A cor do Retamgulo é: " + ab2.getColor());
        System.out.println("Rentagulo área é: " + String.format("%.3f", ab2.area()));
    }
}
