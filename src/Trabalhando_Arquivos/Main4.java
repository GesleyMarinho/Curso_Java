package Trabalhando_Arquivos;

import java.io.File;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o Caminho: ");
        String strPath = ler.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Diretorios: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("Arquivos");

        for(File file: files){
            System.out.println(file);
        }

        boolean sucess = new  File( strPath + "\\subPasta").mkdir();
        System.out.printf("Diretorio Criado com: " + sucess);
        ler.close();

    }
}
