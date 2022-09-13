package Oo_Estoque_Aplication;

import Oo_Estoque_Entidades.Product;

import java.util.Scanner;

public class Program {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Entre com os dados do Produto: ");
        System.out.printf("Nome: ");
        produto.nome = ler.next();
        System.out.printf("Preço: ");
        produto.preco = ler.nextDouble();
        System.out.printf("Quantidade: ");
        produto.quantidade = ler.nextInt();

        System.out.printf("Relatório " + produto.toString());


    }
}
