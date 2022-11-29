package List_exerc01_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas cores deseja cadastrar : ");
        int x = ler.nextInt();

        ArrayList<Cor> coresList = new ArrayList<>();

        Cor cor = new Cor();

        coresList = cor.cadastrarCor(x);
        cor.listarCores(coresList);

      System.out.printf("Qual o Id Deseja buscar: ");
        int pesquisa = ler.nextInt();
        cor.pesquisarCorID(coresList, pesquisa);

        System.out.println("Qual é o ID da cor que vc deseja atualizar: ");
        int idPesquisa = ler.nextInt();
        cor.atulizarCor(coresList,idPesquisa);

        cor.listarCores(coresList);


        System.out.printf("Qual o ID da cor que deseja remover");
        int idCoRemover = ler.nextInt();
        cor.removerCor(coresList,idCoRemover);

        cor.listarCores(coresList);

        System.out.println("Adicionando mais uma Cor ");
        coresList = cor.AdicionarCor();

        cor.listarCores(coresList);




    }
}
