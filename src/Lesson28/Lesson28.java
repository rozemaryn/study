package Lesson28;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static Lesson28.Car.createCar;

public class Lesson28  {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
//
//        LocalTime lt1 = LocalTime.of(1, 2, 3, 4);
//        System.out.println(lt1);
//
//        LocalDateTime lt2 = LocalDateTime.of(2023, Month.JANUARY, 24, 23, 3, 56, 78);
//        System.out.println(lt2);

        LocalDate ld1 = LocalDate.of(2222, 11, 11);
        System.out.println(ld1);
        LocalDate ld2 = ld1.minusDays(5);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = lt1.plusHours(2).minusMinutes(43).plusSeconds(23).minusNanos(568);
        System.out.println(lt2);
        System.out.println(lt1.isAfter(lt2));
    }
}

class Test2 {
    public static void main(String[] args) {
        Car c = createCar();
    }
}

class Car {
    private Car(){}
    static Car createCar () {return new Car();}
}

class Test3 {
    static void changeOfSentry (LocalDate start, LocalDate end, Period p) {
        LocalDate date = start;
        while (date.isBefore(end)) {
            System.out.println("Time to change a person on duty");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate s = LocalDate.of(2022,9,1);
        LocalDate e = LocalDate.of(2023,5,31);
        Period p = Period.ofWeeks(2);
        changeOfSentry(s, e, p);

        LocalDate ld1 = e.plus(p);
        System.out.println(ld1);

        Period p1 = Period.ofYears(3).ofDays(5);
    }
}

class Test4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1994,3, 5, 6, 57, 8, 999);
        // System.out.println(ldt.getDayOfWeek());

        DateTimeFormatter shorty = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(shorty.format(ldt));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM, dd, yyyy, hh:mm");
        System.out.println(f.format(ldt));

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("03 02 2023", f1);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2023-03-02");
        System.out.println(date2);
    }

}
