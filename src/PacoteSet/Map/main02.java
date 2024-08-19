package PacoteSet.Map;

import java.util.HashMap;
import java.util.Map;

public class main02 {
    public static void main (String args[]){

        Map<product,Double> stock = new HashMap<>();
       // Map<Product,Double> stock = new TreeMap<>();

        product p1 = new product("TV",900.0);
        product p2 = new product("Notebook",1200.0);
        product p3 = new product("Tablet",400.0);


        stock.put(p1,10.0);
        stock.put(p2,20.0);
        stock.put(p3,30.0);

        product ps = new product("TV",900.0);

        System.out.printf("Contais 'PS' key " + stock.containsKey(ps));

       /* int count = 1;
        for (Product key : stock.keySet()) {
            System.out.println(count + "° - " +key +", Valor: " + stock.get(key));
            count++;
        }*/

    }
}
