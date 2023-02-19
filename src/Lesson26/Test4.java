package Lesson26;

import java.sql.SQLOutput;

public class Test4 {
    static void abc(String s) {
        System.out.println("A"); // первый приоритет
    }

    static void abc(String... s) {
        System.out.println("B"); // третий
    }

    static void abc(Object s) {
        System.out.println("C"); // второй
    }

    static void abc(String s1, String s2) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok");
    }

}
