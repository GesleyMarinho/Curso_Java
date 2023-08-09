package Trabalhando_Arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler = null;

        File file = new File("C:\\Users\\gesley.marinho\\Downloads\\int.txt");

        try {
            ler = new Scanner(file);
            while (ler.hasNextLine()) {
                System.out.println(" " + ler.nextLine());
            }

        } catch (IOException e) {
            System.out.printf("Error" + e.getMessage());
        } finally {
            {
                if (ler != null) {
                    ler.close();
                }
            }
        }
    }
}
