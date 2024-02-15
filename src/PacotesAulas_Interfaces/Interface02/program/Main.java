package PacotesAulas_Interfaces.Interface02.program;

import PacotesAulas_Interfaces.Interface02.entities.Contract;
import PacotesAulas_Interfaces.Interface02.entities.Installment;
import PacotesAulas_Interfaces.Interface02.services.ContracServices;
import PacotesAulas_Interfaces.Interface02.services.PaypalService;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Entre com o número do Contrato: ");
        int number = ler.nextInt();

        System.out.printf("Entre com a Data do Contratato: ");
        LocalDate date = LocalDate.parse(ler.next(), fmt);

        System.out.printf("Entre com o valor do Contrato: ");
        double totalValue = ler.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.printf("Entre com o número de Parcelas: ");
        int n = ler.nextInt();

        ContracServices contracServices = new ContracServices(new PaypalService());

        contracServices.processContract(obj, n);

        System.out.println("Parcelas");
        for (Installment installment : obj.getInstallmentLis()) {
            System.out.println(installment);
        }

    }
}
