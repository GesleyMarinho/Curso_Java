package PacoteSet;


import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Celular");
        set.add("Notbook");
        System.out.println("" + set.contains("iphone"));

        //  set.removeIf(x  -> x.length() >=3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}
