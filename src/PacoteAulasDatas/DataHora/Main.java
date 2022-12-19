package PacoteAulasDatas.DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String args[]){

        LocalDate d01 = LocalDate.parse("2022-12-13");
        LocalDateTime d02 = LocalDateTime.parse("2022-12-13T20:49:15");
        Instant d03 = Instant.parse("2022-12-13T20:50:07Z");

        LocalDate passWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);

        System.out.println("- 7 dias ( LocalDate )" + passWeek);
        System.out.println("+ 7 dias ( LocalDate ) " + nextWeek);

        LocalDateTime passWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("- 7 dias ( LocalDateTime ) " + passWeekLocalDateTime);
        System.out.println("+ 7 dias ( LocalDateTime )" + nextWeekLocalDateTime);

        Instant passWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7,ChronoUnit.DAYS);


        System.out.println("- 7 dias ( Instant ) " + passWeekInstant);
        System.out.println("+ 7 dias ( Instant )" + nextWeekInstant);


        Duration t1 = Duration.between(passWeekLocalDateTime ,d02);
        System.out.println("T1 Dias " + t1.toDays());

        Duration t2 = Duration.between(passWeek.atStartOfDay(),d01.atStartOfDay());
        System.out.printf("T2 Dias " + t2.toDays());

        Duration t3 = Duration.between(passWeekInstant,d03);
        System.out.println("T3 Dias " + t3.toDays());

    }
}
