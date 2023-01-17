package PacoteHeranca_Polimorfismo.EXFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();


        System.out.printf("Quantas pessoas serão cadastradas: ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Pessoa #" + i + " Dados: ");
            System.out.printf("Qual o tipo de Pessoa F/J: ");
            char op = ler.next().charAt(0);
            System.out.printf("Nome: ");
            String nome = ler.next();
            System.out.printf("Renda Anual: ");
            double rendaAnual = ler.nextDouble();

            if (op == 'f' || op == 'F') {

                System.out.printf("Gasto com Saúde: ");
                double gastoSaude = ler.nextDouble();

                list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));

            } else if (op == 'j' || op == 'J') {

                System.out.printf("Quantidade de Funcionários: ");
                int qtFuncionarios = ler.nextInt();

                list.add(new PessoaJuridica(nome, rendaAnual, qtFuncionarios));
            }
        }
        System.out.println();
        System.out.println("Taxas Pagas");
        double sum = 0;

        for(Pessoa pessoa : list){
            double tax = pessoa.Taxas();
            System.out.println(pessoa.getNome() + " $ " + String.format("%.2f",pessoa.Taxas()));
            sum += tax;
        }

        System.out.println("Total Taxas " + String.format("%.2f",sum));
    }
}
