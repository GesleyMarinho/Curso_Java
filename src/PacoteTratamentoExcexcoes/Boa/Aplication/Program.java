package PacoteTratamentoExcexcoes.Boa.Aplication;

import PacoteTratamentoExcexcoes.Boa.entities.Reservation;
import PacoteTratamentoExcexcoes.Boa.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.printf("Room Number: ");
            int number = ler.nextInt();
            System.out.printf("Qual a data de Entrada: ");
            Date checkIn = sdf.parse(ler.next());
            System.out.printf("Qual a data de Saída: ");
            Date checkOut = sdf.parse(ler.next());

            Reservation reservartion = new Reservation(number,checkIn,checkOut);
            System.out.println("Reservation " + reservartion); //ajuste aqui , estava com to String

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.printf("Qual a data de Entrada: ");
            checkIn = sdf.parse(ler.next());
            System.out.printf("Qual a data de Saída: ");
            checkOut = sdf.parse(ler.next());

            reservartion.updateDates(checkIn,checkOut);
            System.out.println("Reservation " + reservartion);

        } catch (ParseException e) {
            System.out.println("Invalid Date Format");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        ler.close();
    }
}

