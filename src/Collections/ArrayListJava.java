package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        // методы ArrayList

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size());

        arrayList.remove(5);

        // вывод элементов на экран

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (Integer a: arrayList) {
            System.out.println(a);
        }
    }
}

