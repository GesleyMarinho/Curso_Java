package PacoteHeranca_Polimorfismo.abstrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Account acc1 = new Account(1001,"Alex",1000);

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1002, "Maria", 500, 0.01));
        list.add(new BusinessAccount(1003, "Bob", 1000, 500));
        list.add(new SavingsAccount(1004,"Maria",300,0.01));
        list.add(new BusinessAccount(1005,"Anna",500,500));

        System.out.printf("");
        double sum = 0;
        for(Account account : list){
            sum += account.getBalance();
        }
        System.out.println("Total das contas Somados: " + sum);

        for (Account account : list){
            account.deposit(10);
        }

        for (Account account : list){
            System.out.println(" Update Balance for Account " + account.getNumber() +": "+ account.getBalance());
        }

    }
}
