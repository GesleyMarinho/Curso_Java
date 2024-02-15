package PacoteAulasGenerics_Set_Map.Generic_delimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\gesley.marinho\\Downloads\\Material de Apoio\\numeros.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] filds = line.split(",");
                list.add(new Product(filds[0], (Double.parseDouble(filds[1]))));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.printf("Maior Valor é: " + x);

        } catch (IOException e) {
            System.out.printf("Erro: " + e.getMessage());
        }

    }
}
