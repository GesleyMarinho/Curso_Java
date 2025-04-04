package PacoteAulasEspressoesLambadas.Funcoes_Funcoes;


/* Criando funções que recebem
funções como argumento */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductServices ps = new ProductServices();

        double sum = ps.filteredSum(list,p -> p.getNome().charAt(0) =='T');

        System.out.println("Sum = " + String.format("%.2f",sum));
        //System.out.println(String.format("%.2f",ps.filteredSum(list,p-> p.getNome().charAt(0)=='T')));

    }
}
