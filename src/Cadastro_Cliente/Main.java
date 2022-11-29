package Cadastro_Cliente;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Usuarios> userList = new ArrayList<>();
        int op = 0;
        String pesquisa;
        String cont = "S";

        do {

            Usuarios user = new Usuarios();

            System.out.print("1- Listar Usuarios \n" +
                    "2- Remover Usuário \n" +
                    "3- Pesquisar Usuários Cadastrado \n" +
                    "4- Cadastrar Usuários \n" +
                    "O que vc deseja : ");
            op = ler.nextInt();

            if (op == 1) {
                user.listarUsuario(userList);

            } else if (op == 2) {
                System.out.printf("Qual usuário deseja remover: ");
                pesquisa = ler.next();
                user.removerUsuario(userList,pesquisa);


            } else if (op == 3) {
                System.out.printf("Qual Usuário vc deseja Pesquisar: ");
                pesquisa = ler.next();
                user.pesquisarUsuario(userList,pesquisa);

            } else if (op == 4) {
                userList = user.cadastrarUsuarios();
            }

            System.out.printf("Deseja Continuar no Programa S/N: ");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));
    }
}
