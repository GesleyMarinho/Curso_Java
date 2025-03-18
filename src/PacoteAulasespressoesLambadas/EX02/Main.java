package PacoteAulasEspressoesLambadas.EX02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        String path = "C:\\Users\\gesley.marinho\\Downloads\\Estudos\\User.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<User> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {

                String[] vet = line.split(",");
                list.add(new User(vet[0], vet[1], Double.parseDouble(vet[2])));
                line = br.readLine();
            }
            double valor = 2000;
           Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> listEmail = list.stream().filter(p -> p.getSalary() > valor).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
            listEmail.forEach(System.out::println);

           double soma  = list.stream().filter(p->p.getNome().startsWith("M")).mapToDouble(User::getSalary).sum();
            System.out.println(String.format("%.2f", soma));



        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
