package PacoteAulasGenerics_Set_Map.List_genericos;

import java.util.Scanner;
public class Program {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

         PrintService pt = new PrintService();

         System.out.printf("Quantos números deseja Digitar: ");
         int n = ler.nextInt();


         pt.addValue("Debora");
         for(int i =0;  i < n; i ++){
             System.out.printf("Qual o número deseja incluir: ");
             int numero = ler.nextInt();;
             pt.addValue(numero);
         }

         pt.Print();
         System.out.println("");
         System.out.println("First: " + pt.first());

         ler.close();
    }
}
