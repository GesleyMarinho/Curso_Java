package PacoteHeranca_Polimorfismo.MetodosAbstrados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.printf("Enter the number of Shapes: ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Shape #" + i + "data: ");
            System.out.printf("Rectangle or Circle:  ");
            char op = ler.next().charAt(0);
            System.out.printf("Color (Black/RED/Blue): ");
            Color color = Color.valueOf(ler.next());

            if (op == 'r' || op == 'R') {
                System.out.printf("Width: ");
                double width = ler.nextDouble();
                System.out.printf("Height: ");
                double height = ler.nextDouble();
                list.add(new Rectangle(color, width, height));

            } else if (op == 'c' || op == 'C') {

                System.out.printf("Radius: ");
                double rad = ler.nextDouble();

                list.add(new Circle(color, rad));
            }

        }

        System.out.println();
        System.out.println("Shape Areas");

        for(Shape shape: list){
            System.out.println(String.format("%.2f",shape.area()));
        }

    }
}
