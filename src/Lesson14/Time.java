package Lesson14;

public class Time {
    public static void time () {
        OUTER: for (int hour = 0; hour <=23; hour++) {
            System.out.println("The Beginning");
            for (int minute = 0; minute <=59; minute++) {
                if (minute == 20) {
                    continue OUTER;}
                System.out.println(hour + ":" + minute);
                }
            }
            System.out.println("The End");
        }


    public static void main(String[] args) {
        time();
    }
}
