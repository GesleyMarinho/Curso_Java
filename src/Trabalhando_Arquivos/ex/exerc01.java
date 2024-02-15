package Trabalhando_Arquivos.ex;

import Trabalhando_Arquivos.ex.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.printf("Entre com o caminho do arquivo: ");
        String sourceFileStr = ler.nextLine();

        File sourceFile = new File(sourceFileStr);
        String soucerFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFileStr + "\\out").mkdir();

        System.out.println("create: " + success);

        String targertFileStr = soucerFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targertFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.printf(targertFileStr + "Created ");

            } catch (IOException e) {
                System.out.println("Erro Write file:  " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }


    }
}
