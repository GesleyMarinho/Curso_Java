package PacoteAulasEspressoesLambadas.Function;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());


        /*Function<Product,String> func = p -> p.getNome().toUpperCase();
        /*List<String> names = list.stream().map(func).collect(Collectors.toList());*/

        //List<String> names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());



        names.forEach(System.out::println);
    }
}
