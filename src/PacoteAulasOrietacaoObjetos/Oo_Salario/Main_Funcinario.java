package PacoteAulasOrietacaoObjetos.Oo_Salario;

import java.util.Scanner;

public class Main_Funcinario {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        Funcionario f = new Funcionario();

        System.out.printf("Nome: ");
        f.nome = ler.next();
        System.out.printf("Salario Bruto: ");
        f.salarioBruto = ler.nextDouble();
        System.out.printf("Taxa: ");
        f.taxa = ler.nextDouble();

        System.out.println("Relatório " + f.toString());

        System.out.printf("Qual a Taxa de percentual de aumento: ");
        double percent = ler.nextDouble();

        f.incrementoSalario(percent);

        System.out.printf("Relatorio 2 " + f);


    }
}
