package Oo_Notas_Alunos;

import java.util.Scanner;

public class Main_Notas {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.printf("Qual o Nome do Aluno: ");
        a.nome = ler.next();

        System.out.printf("Entre com a primeira Nota: ");
        a.nota1 = ler.nextInt();
        if (a.nota1 < 0 || a.nota1 > 30) {
            System.out.printf("Você Digitou uma nota Inválida");
            ler.close();
        }

        System.out.printf("Entre com a Segunda Nota : ");
        a.nota2 = ler.nextInt();

        if (a.nota2 < 0 || a.nota2 > 35) {
            System.out.printf("Você Digitou a 2° nota Inválida");
            ler.close();
        }

        System.out.printf("Entre com a terceira Nota : ");
        a.nota3 = ler.nextInt();

        if (a.nota3 < 0 || a.nota3 > 35) {
            System.out.printf("Você Digitou a 3° nota Inválida");
            ler.close();
        }

        if(a.mediaAluno() < 60){
            System.out.println("Faltou "+ a.mediaAluno()+ " Pontos");
            System.out.println("Reprovado!");
        }else {
            System.out.println("Nota Final " + a.mediaAluno());
            System.out.println("Aprovado");

        }

       // System.out.println("Relatorio " + a.toString());

    }
}
