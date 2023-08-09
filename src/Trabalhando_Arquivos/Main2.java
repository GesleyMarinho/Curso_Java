package Trabalhando_Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\gesley.marinho\\Downloads\\int.txt";
         //String path = null;


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();

            }
        } catch (IOException e) {
            System.out.printf("Teste arquivo não encontrado" + e.getMessage());

        }
    }
}
