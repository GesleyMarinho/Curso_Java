package PacotesAulas_Interfaces.Default_methods;

import PacotesAulas_Interfaces.Default_methods.Services.BrazilInterestService;
import PacotesAulas_Interfaces.Default_methods.Services.InglaterraInterestServices;
import PacotesAulas_Interfaces.Default_methods.Services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.printf("Amount: ");
        double amount = ler.nextDouble();

        System.out.printf("Months: ");
        int months = ler.nextInt();

        BrazilInterestService br = new BrazilInterestService(2.0);
        double paymentBR = br.payment(amount, months);

        System.out.println("BR: Payment After " + months + " months: " + String.format("%.2f", paymentBR));

        UsaInterestService usa = new UsaInterestService(1.0);
        double paymentUSA = usa.payment(amount, months);

        System.out.println("USA: Payment After " + months + " months: " + String.format("%.2f", paymentUSA));

        InglaterraInterestServices en = new InglaterraInterestServices(3.0);
        double paymentEN = en.payment(amount, months);

        System.out.println("Inglaterra: Payment After " + months + " months: " + String.format("%.2f", paymentEN));




    }
}
