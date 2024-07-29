package PacoteAulasGenerics_Set_Map.HashCode_equals;

public class Main {
    public static void main(String[] args){

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Alex","alex@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c3.equals(c2));


    }
}
