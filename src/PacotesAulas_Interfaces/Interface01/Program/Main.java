package PacotesAulas_Interfaces.Interface01.Program;

import PacotesAulas_Interfaces.Interface01.entities.CarRental;
import PacotesAulas_Interfaces.Interface01.entities.Vehicle;
import PacotesAulas_Interfaces.Interface01.modelServices.BrasilTaxServices;
import PacotesAulas_Interfaces.Interface01.modelServices.RentalServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = ler.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(ler.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(ler.nextLine(), fmt);


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));


        System.out.printf("Entre com o Preço por Hora: ");
        double pricePerHour = ler.nextDouble();

        System.out.printf("Entre com o preço por Dia: ");
        double pricePerDay = ler.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrasilTaxServices());

        rentalServices.porcessInvoice(cr);
        System.out.println("Fatura");
        System.out.println("Pagamento Básico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento Completo: " + cr.getInvoice().getTotalPayment());
        ler.close();
    }
}
