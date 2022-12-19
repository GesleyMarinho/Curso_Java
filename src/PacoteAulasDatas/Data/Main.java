package PacoteAulasDatas.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-11-29");
        LocalDateTime d05 = LocalDateTime.parse("2022-11-29t19:37:50");
        Instant d06 = Instant.parse("2022-11-29t20:37:50Z");
        Instant d07 = Instant.parse("2022-11-29t20:37:50-03:00");

        LocalDate d08 = LocalDate.parse("29/11/2022",  DateTimeFormatter.ofPattern("dd/MM/yyyy")); // chamada Direto. ;
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt02);
        LocalDate d10 = LocalDate.of(2022,11,29);

        LocalDateTime d11 = LocalDateTime.of(2022,11,29,20,02);
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08.toString());
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);

    }
}
