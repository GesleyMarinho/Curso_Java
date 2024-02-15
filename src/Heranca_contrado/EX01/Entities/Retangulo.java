package Heranca_contrado.EX01.Entities;

import Heranca_contrado.EX01.Interface_Abstract.AbstractShape;
import PacoteHeranca_Polimorfismo.MetodosAbstrados.Color;

public class Retangulo extends AbstractShape {

    public double width;
    public double height;

    public Retangulo() {
    }

    public Retangulo(Color color , double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return  width * height;
    }
}
