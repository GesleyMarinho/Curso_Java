package PacoteTratamentoExcexcoes.MuitoRUIM;

import PacoteTratamentoExcexcoes.MuitoRUIM.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf(" Qual o número do Quarto ");
        int number = ler.nextInt();

        System.out.printf(" Qual a data de Entrada ");
        Date checkIn = sdf.parse(ler.next());

        System.out.printf(" Qual a data de Saída ");
        Date checkOut = sdf.parse(ler.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: CHECK-OUT DATE MUST AFTER CHECK IN DATE");
        } else {

            Reservation reservartion = new Reservation(number, checkOut, checkIn);

            System.out.printf(reservartion.toString());
            System.out.println();

            System.out.println("Enter data to update the reservation: ");

            System.out.printf(" Qual a data de Entrada ");
            checkIn = sdf.parse(ler.next());

            System.out.printf(" Qual a data de Saída ");
            checkOut = sdf.parse(ler.next());

            Date now = new Date();

            if (checkOut.before(now) || checkIn.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: CHECK-OUT DATE MUST AFTER CHECK IN DATE");
            } else {
                reservartion.updateDates(checkIn, checkOut);
                System.out.println(reservartion.toString());
            }

        }

    }
}
