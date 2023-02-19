package Lesson13;

import java.time.DayOfWeek;

public class Emp13 {
    public static byte DayoftheWeek = 2;


    public static void main(String[] args) {
        final int a = 5;
        final int b = 10;

        switch (DayoftheWeek)
        {
            case 1:
            case a*b:
            case 3:
            case 4:
                System.out.println("Work ends at 18:00");
                break;
            case 5:
                System.out.println("Work ends at 17:00");
                break;
            case 6:
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Data is incorrect");
        }
    }
}
