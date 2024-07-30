package PacoteSet.EX02;

import java.util.Set;

public class program {
    public static void main(String args[]) {

        System.out.printf("Entre com os dados ");

        String path = "C:\\Users\\gesley.marinho\\Desktop\\Curso\\curso.txt";

        System.out.println();
        Set<curso> set = curso.dadosAlunos(path);

       if(set != null){
           System.out.println("Total de cursos é  " + set.size());
       }else {
           System.out.printf("Nenhuma informação de curso !!!");
       }


    }
}
