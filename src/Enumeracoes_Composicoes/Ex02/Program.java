package Enumeracoes_Composicoes.Ex02;

import Enumeracoes_Composicoes.Ex02.entities.Comment;
import Enumeracoes_Composicoes.Ex02.entities.post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) throws ParseException {

        //Scanner ler = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Fazer uma boa Viagem");
        Comment c2 = new Comment("Uau, isso é incrível");

        post p1 = new post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Eu vou visitar esse lugar maravilhoso !!!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.print(p1);

        System.out.printf("\n \n");
        Comment c3 = new Comment("Boa Noite");
        Comment c4 = new Comment("Que a força esteja com você");

        post p2 = new post(sdf.parse("28/07/2018 23:14:19"),"Boa Noite Pessoal","Vejo você mais tarde amanhã",5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.print(p2);
    }
}
