package Enumeracoes_Composicoes.Ex03.Aplication;

import Enumeracoes_Composicoes.Ex03.entities.Client;
import Enumeracoes_Composicoes.Ex03.entities.OrdemItem;
import Enumeracoes_Composicoes.Ex03.entities.Order;
import Enumeracoes_Composicoes.Ex03.entities.Produto;
import Enumeracoes_Composicoes.Ex03.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Program {
    public static void main (String[] args) throws ParseException {

        Scanner ler  = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Digite seu Nome: ");
        String nome = ler.next();
        System.out.printf("Digite seu email: ");
        String email = ler.next();
        System.out.printf("Qual a data de Aniversário: ");
        Date dataAniversario = sdf.parse(ler.next());

        Client client = new Client(nome, email , dataAniversario);

        System.out.println("Entre com o Status do Pedido ");
        System.out.printf("Status do Pedido: ");
        OrderStatus orderStatus = OrderStatus.valueOf(ler.next());

        Order order = new Order(new Date(),orderStatus,client);

        System.out.printf("Quantos Itens no Pedido: ");
        int n = ler.nextInt();

        for(int i=1; i<=n;i++){
            System.out.printf("#" + i +" Nome do item :");
            ler.nextLine();
            String protudoNome = ler.next();
            System.out.printf("#" + i +" Preço do produto: ");
            double precoProduto = ler.nextDouble();

            Produto produto = new Produto(protudoNome, precoProduto);

            System.out.printf("#" + i +" Quantidade do Item: ");
            int quantidade = ler.nextInt();

            OrdemItem ordemItem = new OrdemItem(quantidade, precoProduto,produto);

            order.addClient(ordemItem);
        }

        System.out.println();
        System.out.println("Resumo do Pedido: ");
        System.out.print(order);

    }
}
