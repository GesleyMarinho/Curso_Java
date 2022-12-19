package PacoteAulasLista.List_exerc01_2;

import Cadastro_Cliente.Usuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);


        String cont = "S";
        int op =0;

        ArrayList<Cor> coresList = new ArrayList<>();

        do {

            Cor cor = new Cor();

            System.out.print("1- Cadastrar Cores \n" +
                    "2- Listar Cores \n" +
                    "3- Pesquisar Cor Cadastrado \n" +
                    "4- Remover Cor \n" +
                    "5- Atualizar Cor \n" +
                    "6- Adicionar Mais 1 Cor \n" +
                    "O que vc deseja : ");
            op = ler.nextInt();

            if(op == 1){
                System.out.printf("Quantas cores deseja cadastrar : ");
                int x = ler.nextInt();
                coresList = cor.cadastrarCor(x);
            }else if(op == 2){
                cor.listarCores(coresList);
            } else if ( op ==3) {
                System.out.printf("Qual o Id Deseja buscar: ");
                int pesquisa = ler.nextInt();
                cor.pesquisarCorID(coresList, pesquisa);
            }else if(op==4){
                System.out.printf("Qual o ID da cor que deseja remover");
                int idCoRemover = ler.nextInt();
                cor.removerCor(coresList, idCoRemover);
            } else if (op == 5) {
                System.out.printf("Qual é o ID da cor que vc deseja atualizar: ");
                int idPesquisa = ler.nextInt();
                cor.atulizarCor(coresList, idPesquisa);
            } else if (op == 6) {
                System.out.println("Adicionando mais uma Cor ");
                coresList = cor.AdicionarCor();
            }

            System.out.printf("Deseja Continuar S/N :");
            cont = ler.next();

        }while (cont.equalsIgnoreCase("S"));


    }
}
