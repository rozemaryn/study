package Lesson28;

import java.sql.Date;
import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Homework28 {

    static DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static void change (LocalDateTime ld1, LocalDateTime ld2, Period p, Duration dur) {
        while (ld1.isBefore(ld2)) {
            System.out.println("Work hours: from " + ld1.format(d1));

            ld1 = ld1.plus(p);
            System.out.println("till " + ld1.format(d1));

            System.out.println("Holidays start from " + ld1.format(d2));
            ld1 = ld1.plus(dur);
            System.out.println("till " + ld1.format(d2));
        }
    }


    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.of(2023, 01, 26, 8, 0);
        LocalDateTime d2 = LocalDateTime.of(2023, 03, 01, 17, 59);
        Period p = Period.ofDays(2);
        Duration d = Duration.ofHours(10);

        change(d1, d2, p, d);



    }
}
