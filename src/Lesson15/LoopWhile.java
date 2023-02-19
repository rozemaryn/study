package Lesson15;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <=10) {
            System.out.println(i);
            i++;
        }

        System.out.println(i);
    }
}

class Test1 {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Make your bets, ladies and gentlemen");
            System.out.println("Alas, you've lost");
            money = money - 10;
            System.out.println(money);
        }
        System.out.println(money);
    }
}

class Test2 {
    public static void main(String[] args) {
        boolean b = true;
        int i = 1;

        while (b){
            if (i%7 == 0 && i%3 == 0) {
                b = false;
            }
            System.out.println(i);
            i++;
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        int a = 5;
        while (a++ < 10) {
            a++;
        }
        System.out.println(a);
    }
}

class Test4 {
    public static void main(String[] args) {
        int a = 5;
        while (a < 10);
    }
}

class Test5 {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while (i==11);
    }
}

class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("Make your bets");
            System.out.println("Alas, you've lost");
            money -= 10;
        }
        while (money > 50);

        /*
        do
            System.out.println("abrakadabra");
        System.out.println("a nifiga");
        while (true); */

        do {
            System.out.println("Some text");
        }
        while (5==10);
    }
}

class Test8 {
    public static void main(String[] args) {
        int hour = -1;
        OUTER: do {
            hour ++;
            int minute = 0;
            INNER: while (minute < 60) {
                if (minute == 20) {
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute ++;
            }
        }
        while (hour <24);
    }
}

class Test9 {
    public static void main(String[] args) {

        for (int hour = 0; hour <24; hour ++) {
            int minute = 0;
            while (minute <60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}