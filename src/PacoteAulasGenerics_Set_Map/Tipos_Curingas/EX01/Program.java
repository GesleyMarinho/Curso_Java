package PacoteAulasGenerics_Set_Map.Tipos_Curingas.EX01;

import PacoteAulasGenerics_Set_Map.Tipos_Curingas.EX01.ENTITIES.Circle;
import PacoteAulasGenerics_Set_Map.Tipos_Curingas.EX01.ENTITIES.Rectangle;
import PacoteAulasGenerics_Set_Map.Tipos_Curingas.EX01.ENTITIES.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Area total é: " + totalArea(myShapes));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;

        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
