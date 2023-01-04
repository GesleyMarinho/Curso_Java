package PacoteHeranca_Polimorfismo.EX01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.printf("Quantos Funcionários: ");
        int n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Empregado " + i + " Dados : ");

            System.out.printf("Ele é Tercerizado S/N: ");
            char op = ler.next().charAt(0);

            System.out.printf("Qual o Nome: ");
            String nome = ler.next();

            System.out.printf("Quantas horas Trabalhadas: ");
            int horas = ler.nextInt();

            System.out.printf("Qual o valor da Hora: ");
            double valorH = ler.nextDouble();

            if (op == 'S' || op == 's') {
                System.out.printf("Quantas horas Extras:  ");
                double horasExtras = ler.nextDouble();
                Empregado empregado = new EmpregadoTercerizado(nome,horas,valorH,horasExtras);
                list.add(empregado);
            } else {
                Empregado empregado = new Empregado(nome, horas, valorH);
                list.add(empregado);
            }
        }
        System.out.println();
        System.out.println("Pagamentos");

        for(Empregado empregado : list){
            System.out.println(empregado.getNome() + " - $ " + String.format("%.2f",empregado.Pagamento()));
        }

    }
}
