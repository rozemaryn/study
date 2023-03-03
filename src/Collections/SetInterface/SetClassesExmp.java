package Collections.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassesExmp {
    public static void main(String[] args) {
        Set <String> hashSet = new HashSet<>(); // элементы неупорядочены
        Set <String> linkedHashSet = new LinkedHashSet<>(); // элементы по добавлению/использованию
        Set <String> treeSet = new TreeSet<>(); // элементы по возрастанию

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for (String name:
             hashSet) {
            System.out.println(name);
        }

        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        System.out.println(linkedHashSet);

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");
        treeSet.add("Tom");

        System.out.println(treeSet);

        System.out.println(hashSet.isEmpty());
    }
}

class SetOperations {
    public static void main(String[] args) {
        Set <Integer> hs1 = new HashSet<>();

        for (int i = 0; i < 6; i++) {
            hs1.add(i);
        }
        System.out.println(hs1);

        Set <Integer> hs2 = new HashSet<>();
        for (int i = 2; i < 8; i++) {
         hs2.add(i);
        }

        System.out.println(hs2);

        // union — объединение
        Set <Integer> unionSet = new HashSet<>(hs1);
        unionSet.addAll(hs2);
        System.out.println(unionSet);

        // intersection — пересечение
        Set <Integer> intersectSet = new HashSet<>(hs1);
        intersectSet.retainAll(hs2);
        System.out.println(intersectSet);

        // difference — разность

        Set <Integer> differSet = new HashSet<>(hs1);
        differSet.removeAll(hs2);
        System.out.println(differSet);

    }
}
