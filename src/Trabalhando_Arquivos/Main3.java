package Trabalhando_Arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main (String[] args){

        String[] line = new String[] {"BOM DIA","Boa Tarde", "Boa Noite"};

        String path = "C:\\Users\\gesley.marinho\\Desktop\\curso_java\\subPasta";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String lines : line){
                bw.write(lines);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
