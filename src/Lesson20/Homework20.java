package Lesson20;

import java.util.*;

public class Homework20 {
    public static void abc(String[] array) {

        int i = 0;

        while (i < array.length) {

            int k = i + 1;

            while (k < array.length) {
                if (Objects.equals(array[i], array[k])) {
                    array[k] = null;
                }
                k++;
            }
            i++;
        }

        List<String> list1 = new ArrayList<>(Arrays.asList(array));

        list1.removeAll(Collections.singleton(null));

        int  l = 0; // переменная, которая ходит по листу, должна быть меньше его длины
        int m = 1; // первый элемент массива, с ним сперва сравниваем, потом m++

        while (l < list1.size()) {

            String min = list1.get(l); // нулевой элемент, который сперва считаем минимумом
            int minIndex = list1.indexOf(list1.get(l)); // индекс элемента-минимума, сперва 0

            while (m < list1.size())  {
                int c = min.compareTo(list1.get(m)); // результат сравнения 2 элементов, возвращает int

                if (c > 0) {
                    min = list1.get(m);
                    minIndex = list1.indexOf(list1.get(m));
                }
                m++;
            }

            String buf = list1.get(l); // записали нулевой элемент в buf
            list1.set(l, min); // на место нулевого элемента записали новый минимум
            list1.set(minIndex, buf); // поставили на место найденного минимума нулевой элемент

            l++;
            m = 1 + l;
        }

        System.out.println(list1);

    }

    public static void main(String[] args) {
        abc(new String[]{"E", "-1", "3", "E", "B76", null, "C", "F", "B"});

    }
}

class HomeworkPrep {
    public static void sortString(ArrayList<String> list1) {

        int l = 0; // переменная, которая ходит по листу, должна быть меньше его длины
        int m = 1; // первый элемент массива, с ним сперва сравниваем, потом m++

        while (l < list1.size()) {

            String min = list1.get(l); // нулевой элемент, который сперва считаем минимумом
            int minIndex = list1.indexOf(list1.get(l)); // индекс нулевого элемента-минимума

            while (m < list1.size())  {
                int c = min.compareTo(list1.get(m)); // результат сравнения 2 элементов, возвращает int

                if (c > 0) {
                    min = list1.get(m);
                    minIndex = list1.indexOf(list1.get(m));
                }
                m++;
            }

            String buf = list1.get(l); // записали нулевой элемент в buf
            list1.set(l, min); // на место нулевого элемента записали новый минимум
            list1.set(minIndex, buf); // поставили на место найденного минимума нулевой элемента

            l++;
            m = 1 + l;
        }

        System.out.println(list1);
    }

    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");
        list2.add("A");

        sortString(list2);

    }
}
