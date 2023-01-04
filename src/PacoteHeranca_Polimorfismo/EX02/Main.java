package PacoteHeranca_Polimorfismo.EX02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner ler = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Qual a quantidade de Produtos: ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Produto " + i + " Dados: ");

            System.out.printf("Qual o Tipo do Produto (U/I/N): "); // U -Usado , N- Novo, I - Importado
            char op = ler.next().charAt(0);

            if (op == 'i' || op == 'I') {
                System.out.printf("Nome do Produto: ");
                String nome = ler.next();

                System.out.printf("Qual o preço do Produto: ");
                double preco = ler.nextDouble();

                System.out.printf("Qual o valor da Taxa de Importação: ");
                double taxaImportacao = ler.nextDouble();

                Produto produto = new ProdutoImportado(nome, preco, taxaImportacao);
                list.add(produto);

            } else if (op == 'n' || op == 'N') {

                System.out.printf("Nome do Produto: ");
                String nome = ler.next();

                System.out.printf("Qual o preço do Produto: ");
                double preco = ler.nextDouble();
                Produto produto = new Produto(nome, preco);

                list.add(produto);

            } else if (op == 'u' || op == 'U') {
                System.out.printf("Nome do Produto: ");
                String nome = ler.next();

                System.out.printf("Qual o preço do Produto: ");
                double preco = ler.nextDouble();

                System.out.printf("Qual a data de Fabricação: ");
                Date date = sdf.parse(ler.next());

                Produto produto = new ProdutoUsado(nome, preco, date);
                list.add(produto);

            }

        }
        System.out.println("Lista de Produtos...");
        for (Produto produto : list){
            System.out.println(produto.precoEtiqueta());
        }

    }
}
