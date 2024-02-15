package Trabalhando_Arquivos;

import java.io.File;
import java.util.Scanner;

public class Main5 {

    public static  void main (String args[]){

        Scanner ler  = new Scanner(System.in);

        System.out.printf("Entre com o caminho do arquivo: ");
        String strPath = ler.nextLine();

        File path = new File(strPath);

        System.out.printf("get nome "+ path.getName());
        System.out.printf("\n");
        System.out.printf("get nome "+ path.getPath());
        System.out.printf("\n");
        System.out.printf("get nome" + path.getParent());
    }
}
