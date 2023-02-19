package Lesson27;

import java.util.ArrayList;

public class Test10 {

    public static void main(String[] args) throws Exception { // 2. надо добавить throws

        Exception e = null;
        throw e; /* 1. вот так компилятор нам не позволяет написать, пч класс Exception —
               это cheked exception */
    } // 3. и тогда уже runtime выбросится NullPointerException



}

class Test11 {

     static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add("!!!");
        System.out.println(list);

        Integer.parseInt("44ab");
    }
}

class Test12 {
    static {
        int a = Integer.parseInt("13ab");
    }

    static String s = null;
    static int a = s.length();

    public static void main(String[] args) {

    }
}
