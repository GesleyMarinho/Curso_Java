package Oo_Exercicio_banco;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int op = 0;
        String cont = "S";

        Conta conta;

        System.out.printf("Qual o número da Conta: ");
        int numeroConta = ler.nextInt();
        System.out.printf("Qual o Nome do cliente: ");
        String nome = ler.next();
        System.out.printf("Você tem um deposito inicial ?  Y/N : ");
        String resp = ler.next();
        if (resp.equalsIgnoreCase("Y")) {
            System.out.printf("Qual o Deposito Inicial: ");
            double depositoInicial = ler.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);

        } else {

            conta = new Conta(numeroConta, nome);
        }

        System.out.println(conta);
        do {

            System.out.printf("1 -Fazer um Déposito \n" +
                    "2- Fazer um Saque \n" +
                    "Qual a Opção Desejada : ");
            op = ler.nextInt();

            if (op == 1) {
                System.out.printf("Qual o valor deseja Depositar na conta: ");
                double depositar = ler.nextDouble();
                conta.deposit(depositar);
                System.out.println("O seu Saldo agora é de " + conta);

            } else if (op == 2) {
                System.out.printf("Qual o valor deseja Retirar  na conta: ");
                double retirada = ler.nextDouble();
                conta.withdraw(retirada);
                System.out.println("O seu Saldo agora é de " + conta);
            }

            System.out.printf("Deseja Continuar S/N: ");
            cont = ler.next();

        } while (cont.equalsIgnoreCase("S"));

    }
}
