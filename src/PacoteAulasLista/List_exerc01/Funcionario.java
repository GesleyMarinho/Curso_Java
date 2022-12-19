package PacoteAulasLista.List_exerc01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario() {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Funcionario> cadastrarFuncionarios(int x) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Funcionario> funcionariosList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            Funcionario funcionario = new Funcionario();
            System.out.printf("Qual o ID do Funcionário: ");
            funcionario.setId(ler.nextInt());
            System.out.printf("Qual o nome do funcionário: ");
            funcionario.setNome(ler.next());
            System.out.printf("Qual o salario do Funcionário: ");
            funcionario.setSalario(ler.nextDouble());

            funcionariosList.add(funcionario);
            System.out.println("-----------------");
        }
        return funcionariosList;
    }

    public void aumentarsalario(double percetualAumento) {

        salario += salario * percetualAumento / 100;
    }

    public void listarFuncionarios(List<Funcionario> funcionariosList) {

        if (funcionariosList.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado");
        } else {
            System.out.printf("\n");
            for (int i = 0; i < funcionariosList.size(); i++) {
                System.out.println("Emplyoee " + (i + 1) + "\nID: " + funcionariosList.get(i).getId() + "\nNome: " + funcionariosList.get(i).getNome() + " \nSalario: " + funcionariosList.get(i).getSalario());
            }
        }
    }


}
