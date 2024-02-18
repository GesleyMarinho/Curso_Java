package PacoteAulasGenerics_Set_Map.Curingas_delimitados;

import PacoteAulasGenerics_Set_Map.Curingas_delimitados.entities.Circle;
import PacoteAulasGenerics_Set_Map.Curingas_delimitados.entities.Rectangle;
import PacoteAulasGenerics_Set_Map.Curingas_delimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){

        List<Shape> myList = new ArrayList<>();

        myList.add( new Rectangle(3.0,2.0));
        myList.add(new Circle(3.0));



        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total da area: " + totalArea(myCircle));
    }

    public static  double totalArea(List<? extends Shape> list){
        double sum = 0;

        for(Shape s : list){
            sum += s.area();
        }
        return  sum;
    }
}
