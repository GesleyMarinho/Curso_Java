package PacoteTratamentoExcexcoes.Ex;

import java.text.ParseException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cont = "S";

        // try {
        System.out.println("Cadastrado da Conta");
        System.out.printf("Número da Conta: ");
        int numero = ler.nextInt();
        System.out.printf("NOME da Conta: ");
        String nome = ler.next();
        System.out.printf("Saldo da conta: ");
        double saldo = ler.nextDouble();
        System.out.printf("Limite para Saque: ");
        double limite = ler.nextDouble();

        Conta conta = new Conta(numero, nome, saldo, limite);

        do {

            System.out.printf("Deseja fazer alguma Operação: \n" +
                    "1- Deposito \n"
                    + "2- Saque \n"
                    + "Qual opção vc Deseja: ");
            int op = ler.nextInt();

            if (op == 1) {
                System.out.printf("Qual o valor deseja Depositar: ");
                double valor = ler.nextDouble();
                conta.deposito(valor);
            } else if (op == 2) {
                System.out.printf("Qual o valor deseja fazer de Saque: ");
                double valor = ler.nextDouble();
                try {
                    conta.saque(valor);
                    System.out.println("Novo Saldo: " + conta.getSaldo());
                } catch (DomainException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.printf("Deseja Continuar S/N: ");
            cont = ler.next();
        } while (cont.equalsIgnoreCase("S"));


        System.out.println();
        System.out.println("Extrato do Cliente \n" + conta.toString());

    }
}
