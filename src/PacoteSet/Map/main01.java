package PacoteSet.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class main01 {
    public static void main(String args[]) {



        Map<String, String> cookies = new TreeMap<>();

        cookies.put("Chave", "Valor");
        cookies.put("Username", "Maria");
        cookies.put("phone", "31987495468");
        cookies.put("phone2", "31985336120");


        System.out.println("Teste chave: " + cookies.get("Chave"));
        System.out.println("Teste chave nome: " + cookies.get("Username"));
        System.out.println("teste chave phone: " + cookies.get("phone"));
        cookies.remove("Username");
        System.out.println("teste de remoção de chave nome: " + cookies.get("Username"));
        System.out.println("Teste tamanho: " + cookies.size());

        System.out.println("All Cookies");
        int count = 1;
        for (String key : cookies.keySet()) {
            System.out.println(count + "° - " +key +", Valor: " + cookies.get(key));
            count++;
        }


    }
}
