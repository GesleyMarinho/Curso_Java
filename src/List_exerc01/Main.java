package List_exerc01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        List<Funcionario> funcionariosList = new ArrayList<>();


        String cont = "S";
        int op = 0;
        System.out.printf("Quantos Funcionários vc tem ? ");
        int x = ler.nextInt();

        do {

            Funcionario funcionario = new Funcionario();
            System.out.printf("1- Cadastrar Funcionário \n" + "2- Aumentar Salario \n" + "3- Lista com Funcionários \n" + "Qual a opção vc Deseja ?");
            op = ler.nextInt();

            if (op == 1) {

                funcionariosList = funcionario.cadastrarFuncionarios(x);
            } else if (op == 2) {
                System.out.printf("Qual o Id Do funcinário que vai receber aumento: ");
                int y = ler.nextInt();

                Integer pos = position(funcionariosList, y);
                if (pos == null) {
                    System.out.println(" Id não existe");
                } else {
                    double percetualAumento = 10;
                    funcionariosList.get(pos).aumentarsalario(percetualAumento);
                }
            } else if (op == 3) {
                funcionario.listarFuncionarios(funcionariosList);
            }
            System.out.printf("Deseja continuar no MENU S/N: ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("s"));

    }

    public static Integer position(List<Funcionario> funcionariosList, int y) {
        for (int i = 0; i < funcionariosList.size(); i++) {
            if (funcionariosList.get(i).getId() == y) {
                return i;
            }
        }
        return null;
    }
}
