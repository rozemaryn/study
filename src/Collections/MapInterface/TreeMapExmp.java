package Collections.MapInterface;

import java.util.TreeMap;

public class TreeMapExmp {
    public static void main(String[] args) {
        TreeMap<Double, Collections.MapInterface.Student> treemap = new TreeMap<>();

        Student st1 = new Student("Maria", "Kostianetskaia", 2);
        Student st2 = new Student("Zinaida", "Savelieva", 4);
        Student st3 = new Student("Kotya", "Kotovskiy", 5);
        Student st4 = new Student("Maria", "Kostianetskaia", 2);
        Student st5 = new Student("Zinaida", "Savelieva", 4);
        Student st6 = new Student("Kotya", "Kotovskiy", 5);
        Student st7 = new Student("Kate", "Bate", 3);

        treemap.put(7.2, st3);
        treemap.put(7.5, st4);
        treemap.put(5.8, st1);
        treemap.put(6.4, st2);
        treemap.put(8.2, st6);
        treemap.put(9.1, st7);
        treemap.put(7.9, st5);

        System.out.println(treemap.descendingMap());

        System.out.println(treemap.tailMap(6.4));
        System.out.println(treemap.headMap(6.4));


    }
}
