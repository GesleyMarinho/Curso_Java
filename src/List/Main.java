package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("Anna");
        list.add("Gesley");
        list.add("Marco");
        list.add("Kaio");
        list.add("Andre");
        list.add("Gabriel");

        for (String x : list) {
            System.out.println("" + x);
        }

        System.out.println("===========================");

        System.out.println("Tamanho da Lista : " + list.size());
        System.out.println("===========================");

        list.removeIf(x -> x.charAt(3) == 'o');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("===========================");

        System.out.println(list.indexOf("Gabriel"));
        System.out.println(list.indexOf("Gesley"));

        System.out.println("===========================");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(result);
        }

        System.out.println("===========================");

        String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
        System.out.println(name);

    }
}
