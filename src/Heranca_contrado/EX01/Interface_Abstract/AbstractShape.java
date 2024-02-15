package Heranca_contrado.EX01.Interface_Abstract;

import PacoteHeranca_Polimorfismo.MetodosAbstrados.Color;

public abstract class AbstractShape implements  Shape{
    private Color color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
