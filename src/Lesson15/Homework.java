package Lesson15;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Input number greater than 100: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
        } while (number <= 100);
    }
}

class Time {

    public static void hours() {
        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minute = 0;
            MINUTE:
            do {
                if (hour > 1 && minute % 10 == 0) {
                    break;
                }
                int second = 0;
                minute++;
                SECOND:
                while (second < 60) {
                    if (hour * second > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            }
            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        hours();


    }
}


    /* HOUR: for (int hour = 0; hour <6; hour++) {
            MINUTE: for (int minute = 0; minute <=59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break;
                }
                SECOND: for (int second = 0; second <=59; second++) {

                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    } */