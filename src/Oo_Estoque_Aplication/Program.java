package Oo_Estoque_Aplication;

import Oo_Estoque_Entidades.Product;

import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Entre com os dados do Produto: ");
        System.out.print("Nome: ");
        produto.setNome(ler.next());
        System.out.print("Preço: ");
        produto.setPreco(ler.nextDouble());
        System.out.print("Quantidade: ");
        produto.setQuantidade(ler.nextInt());

        System.out.println("Relatório 1 " + produto.toString());

        System.out.print("Digite a quantidade de entrada no Estoque: ");
        int quantidade = ler.nextInt();
        produto.adicionarQuantidade(quantidade);

        System.out.println("Relatório 2 " + produto.toString());

        System.out.print("Digite a quantidade de saida no Estoque: ");
        quantidade = ler.nextInt();
        produto.removerQuantidade(quantidade);

        System.out.println("Relatório 3 " + produto.toString());


    }
}
