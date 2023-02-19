package Lesson20;

import Lesson11.Homework.Car;
import Lesson7.A;

import java.lang.reflect.Array;
import java.util.*;

public class Lesson20 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("evening");
        Car c = new Car("black", "V6", 4);
        list.add(c);
        list.add(new StringBuilder("night"));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("morning");
        // list1.add(new Lesson8.Car()); — вот тут ошибка, в list1 можно только String добавлять

        List<StringBuilder> list2 = new ArrayList<>(30);

        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println(list3 == list1);
    }
}

class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Witcher");
        list.add("Geralt of");
        list.add("Rivia");
        list.add(1, "name is");
        // list.add (5,"check"); — так нельзя, пч индекс выходит за size

        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list.get(3));

        list.set(0, "Him witcher,");

        list.remove("name is");

        for (String s : list) {
            System.out.print(s + " ");
        }


    }
}

class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("First");
        StringBuilder sb2 = new StringBuilder("Second");
        StringBuilder sb3 = new StringBuilder("Third");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (StringBuilder sb : list
        ) {
            sb.append("!!!");
        }

        list.remove(2);

        list.remove(sb2);

        for (StringBuilder sb : list
        ) {
            System.out.println(sb);
        }

    }
}

class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Witcher, ");
        list.add("Geralt of ");
        list.add("Rivia. ");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Slayer of monsters, ");
        list2.add("defilier of women. ");

        list.addAll(list2);

        list2.set(1, "connosier of women.");

        list.clear();

        for (String s : list) {
            System.out.print(s);
        }
        for (String s : list2) {
            System.out.println();
            System.out.print(s);
        }

    }
}

class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Witcher, "));
        list.add(new String("Geralt of "));
        list.add(new String("Rivia. "));
        list.add(new String("At your service"));
        list.add(new String("Witcher, "));

        System.out.println(list.lastIndexOf("Witcher, "));

        System.out.println(list.size());

        //list.clear();

        System.out.println(list.isEmpty());

        System.out.println(list.contains("Rivia. "));

        System.out.println(list.toString());
    }
}

class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();
        System.out.println(list == list1); // будет false, пч сылаются на разные объекты.

//        System.out.println(list1.toString());
//        System.out.println(list);
//
//        System.out.println(list.get(0)==list1.get(0));

        list.get(0).append("!!!");
        System.out.println(list1.get(0));

        list.set(0, new StringBuilder("D"));
        System.out.println(list1.get(0));
        System.out.println(list.get(0));

        Object[] array1 = list.toArray();

        System.out.println(Arrays.toString(array1));

    }
}

class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        StringBuilder[] array = list.toArray(new StringBuilder[10]);

        System.out.println(Arrays.toString(array));

        StringBuilder[] array2 = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list5 = Arrays.asList(array2);

        System.out.println(list5);

        array2[0].append("!!!");
        System.out.println(list5);

        array2[0] = new StringBuilder("Replacement");
        System.out.println(list5);

    }
}

class Test9 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list = new ArrayList<>();
        list.add(s4);
        list.add(s2);
        list.add(s3);
        list.add(s1);

        System.out.println(list.toString());

        Collections.sort(list);

        System.out.println(list.toString());

        ArrayList<String> list2 = list;
        System.out.println(list.equals(list2));

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s4);
        list3.add(s2);
        list3.add(s3);
        list3.add(s1);

        Collections.sort(list3);

        System.out.println(list.equals(list3));
        System.out.println(list == list3);
    }
}

class Test10 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list = new ArrayList<>();
        list.add(s4);
        list.add(s2);
        list.add(s3);
        list.add(s1);

        ListIterator <String> it = list.listIterator();
        //Машуня кисуня
        while (it.hasNext()) {
            it.next();
            it.remove();
        }

        System.out.println(list.toString());


    }
}