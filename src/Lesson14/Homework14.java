package Lesson14;

public class Homework14 {
    public static void hours () {
        HOUR: for (int hour = 0; hour <6; hour++) {
            MINUTE: for (int minute = 0; minute <=59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break;
                }
                SECOND: for (int second = 0; second <=59; second++) {
                if (hour*second > minute) {
                    continue MINUTE;
                }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {

        hours();
    }
}
