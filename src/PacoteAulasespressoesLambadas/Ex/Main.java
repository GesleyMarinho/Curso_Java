package PacoteAulasEspressoesLambadas.Ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\gesley.marinho\\Desktop\\Produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // Media do preço da lista de Produtos;
            double avg = list.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Averange price: " + String.format("%.2f", avg));

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado !");
        }

    }
}
