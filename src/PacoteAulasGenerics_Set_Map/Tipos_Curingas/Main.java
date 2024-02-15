package PacoteAulasGenerics_Set_Map.Tipos_Curingas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
        System.out.println("---------------------");


        List<Object> objects = new ArrayList<>();
        objects.add(10);
        objects.add(20);
        objects.add("Maria");
        printNumeros(objects);

        System.out.println("-------------");
        List<String> myString = Arrays.asList("Maria", "Debora", "Gesley", "5");
        printString(myString);
        System.out.println("---------------------");

        List<?> coringa = Arrays.asList(5, 2, 10);
        printCoringa(coringa);

    }

    private static void printList(List<?> list) {
        System.out.println("Coringa");

        for (Object obj : list) { // lista de Inteiros ou String só aceita valores da tipagem do mesmo;
            System.out.println(obj);
        }
    }


    private static void printNumeros(List<Object> list) {
        System.out.println("Object");
        for (Object obj : list) { //Lista de Objects aceita qualquer dado
            System.out.println(obj);
        }
    }

    public static void printString(List<String> list) {
        System.out.println("String");
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printCoringa(List<?> list) {
        System.out.println("Coringa");
        //list.add(99); não pode adicionar valore na lista de coringas
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
