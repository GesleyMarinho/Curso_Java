package Cadastro_Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {
    private String nome;
    private int senha;
    private int idade;


    public Usuarios() {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public ArrayList<Usuarios> cadastrarUsuarios() {
        Scanner ler = new Scanner(System.in);
        ArrayList<Usuarios> userList = new ArrayList<>();

        String cont = "S";

        do {

            Usuarios user = new Usuarios();

            System.out.print("Qual o seu NOME : ");
            user.setNome(ler.next());

            System.out.print("Qual a sua IDADE : ");
            user.setIdade(ler.nextInt());

            System.out.print("Qual a sua Senha : ");
            user.setSenha(ler.nextInt());

            userList.add(user);

            System.out.print("Deseja Continuar Preenchimento dos Usuários S/N :");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));
        return userList;
    }


    public void pesquisarUsuario(List<Usuarios> userList, String pesquisa) {
        if (userList.isEmpty()) {
            System.out.println("Nenhum Usuário Cadastrado, Lista vazia !!!");
        } else {
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getNome().equalsIgnoreCase(pesquisa)) {
                    System.out.println("O usuário " + userList.get(i).getNome() + " está Cadastrado ");
                    return;
                }
            }
            System.out.println("Esse usuário " + pesquisa + " NÃO está Cadastrado ");

        }
    }

    public void listarUsuario(List<Usuarios> userList) {

        if (userList.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado, Lista vazia !!!");
        } else {
            for (int i = 0; i < userList.size(); i++) {
                System.out.println("Nome: " + userList.get(i).getNome() +
                        " Senha: " + userList.get(i).getSenha() + " Idade: " + userList.get(i).getIdade());
            }
        }
    }

    public void removerUsuario(List<Usuarios> userList, String pesquisa) {

        if (userList.isEmpty()) {
            System.out.println("Nenhum Usuário Cadastrado, Lista vazia !!!");
        } else {
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getNome().equalsIgnoreCase(pesquisa)) {
                    System.out.println("Usuário " + userList.get(i).getNome() + " removido com Sucesso !!");
                    userList.remove(i);
                    return;
                }
            }
            System.out.println("Esse Usuário " + pesquisa + " NÃO está cadastrado !!!");
        }

    }
}
