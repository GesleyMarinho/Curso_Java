package PacoteAulasespressoesLambadas.Ex01Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String args[]) {


        List<Product> productList = new ArrayList<>();

        productList.add(new Product("AV", 500.0));
        productList.add(new Product("Computador", 2000.0));
        productList.add(new Product("SmartPhone", 1500.0));

        /*01 Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

            }
        };*/

        /*02 Comparator<Product> comp = (p1,p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };*/

        // 03 Comparator<Product> comp = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

         /*04*/ productList.sort(Comparator.comparing(p -> p.getNome().toUpperCase()));


        for (Product product : productList) {
            System.out.println(product);
        }
    }
}