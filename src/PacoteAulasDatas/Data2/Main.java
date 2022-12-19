package PacoteAulasDatas.Data2;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main (String[] args){


        LocalDate d04 = LocalDate.parse("2022-12-13");
        LocalDateTime d05 = LocalDateTime.parse("2022-12-13T20:30:15");
        Instant d06 = Instant.parse("2022-12-13T20:25:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));

        System.out.println("R1 " + r1);
        System.out.println("R2 " + r2);

        System.out.println("R3 "+ r3);
        System.out.println("R4 " + r4);

        System.out.println("D04 dia " + d04.getDayOfMonth());
        System.out.println("D04 mês " + d04.getMonthValue());
        System.out.println("D04 ano " + d04.getYear());

        System.out.println("D05 Horas "+ d05.getHour());
        System.out.println("D05 Minutos "+ d05.getMinute());
        System.out.println("D05 Segundos "+ d05.getSecond());
    }
}
