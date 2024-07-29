package PacoteSet;

import java.util.HashSet;
import java.util.Set;

public class main3 {
    public static void main (String[] args ){

        Set<Product> set  = new HashSet<>();

        set.add(new Product("TV",900));
        set.add(new Product("Notebook",1200));
        set.add(new Product("Tablet",400));

        Product prod = new Product("Notebook",1200);


        System.out.println(set.contains(prod));

    }
}
