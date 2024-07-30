package PacoteSet.EX01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class program {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Enter com o caminho do arquivo path: ");
        //String path = ler.nextLine();
        String path = "C:\\Users\\gesley.marinho\\Desktop\\Curso\\users_set_aula13.txt";

        System.out.println();
        Set<logEntry> set = logEntry.dadosArquivo(path);

        if (set != null) {
            System.out.println("Total de Users: " + set.size());
        } else {
            System.out.println("Error ao ler o arquivo");
        }

        ler.close();
    }

}
