package PacoteSet.Map.EX01;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Ex {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        Map<String, Integer> apr = new LinkedHashMap<>();

        System.out.println("Apuração de Votos  2024 ");

        String path = "C:\\Users\\gesley.marinho\\Desktop\\Curso\\votos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();
            while (linha != null) {

                String fields[] = linha.split(" ");
                String nome = fields[0];
                int count = Integer.parseInt(fields[1]);

                apr.put(nome, apr.getOrDefault(nome, 0) + count);

                linha = br.readLine();
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(apr.entrySet());
            list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            System.out.println("Resultado solto");
            for (String key : apr.keySet()) {
                System.out.println(key + ": " + apr.get(key));
            }

            System.out.println("Resultado organizado");
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.printf("Erro ao ler o arquivo: " + e.getMessage());
        }

        ler.close();
    }
}
