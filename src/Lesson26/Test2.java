package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); // добавили int, компилятор уже сам сделает это Integer и добавит в массив
        int a = list.get(0);

        Long l = 50l; // вот здесь без l нельзя 50 написать, т.к. это будет int, а он не конвертится автоматом в Long

        Number b = new Integer(10);
        int c = (int) b;
        switch ((int) b) {}

        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        // int i1 = Integer.parseInt(s1);
        System.out.println(Integer.parseInt(s1));
        Boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);

        // Byte b10 = new Byte(5); // такое не пройдёт, нужет каст
        Byte b11 = (byte) 5; //а так уже норм
    }
}
