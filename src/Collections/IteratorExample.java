package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zaur");
        names.add("Ivan");
        names.add("Mary");
        names.add("Nico");
        names.add("Lida");

        Iterator <String> iterator = names.iterator();

        // пока есть след. элемент, выводи его на экран
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // пока есть след. элемент, получаем его (next) и удаляем
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(names);

//        for (String name: names
//             ) {
//            names.remove(1);
//        }

        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator <Integer> iterator2 = list.iterator();

        int idx = 0;

        while (iterator2.hasNext()) {
            iterator2.next();
            if (idx == 1) {
                iterator2.remove();
            }
            idx++;
        }

        System.out.println(list);
    }
}
