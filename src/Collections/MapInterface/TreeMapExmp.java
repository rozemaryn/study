package Collections.MapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExmp {
    public static void main(String[] args) {
        TreeMap<Collections.MapInterface.Student, Double> treemap = new TreeMap<>();

        // вариант, когда мы не имплементируем интерфейс
//        TreeMap<Collections.MapInterface.Student, Double> treemap2 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

        Student st1 = new Student("Maria", "Kostianetskaia", 2);
        Student st2 = new Student("Zinaida", "Savelieva", 4);
        Student st3 = new Student("Kotya", "Kotovskiy", 5);
        Student st4 = new Student("Maria", "Kostianetskaia", 2);
        Student st5 = new Student("Zinaida", "Savelieva", 4);
        Student st6 = new Student("Kotya", "Kotovskiy", 5);
        Student st7 = new Student("Kate", "Bate", 3);
        Student st8 = new Student("Kate", "Bate", 3);

        treemap.put(st3, 7.2);
        treemap.put(st4, 7.5);
        treemap.put(st1, 5.8);
        treemap.put(st2, 6.4);
        treemap.put(st6, 8.2);
        treemap.put(st7, 9.1);
        treemap.put(st5, 7.9);
        treemap.put(st8, 7.8);

        System.out.println(treemap);
        System.out.println(treemap.descendingMap());
        System.out.println(treemap.containsKey(st7));
        System.out.println(st7.equals(st8));
        System.out.println(treemap);

//        System.out.println(treemap.tailMap(6.4));
//        System.out.println(treemap.headMap(6.4));
//        System.out.println();
//        System.out.println(treemap.lastEntry());
//        System.out.println(treemap.firstEntry());

        TreeMap <Double, Student> treeMap2 = new TreeMap<>();

        treeMap2.put(5.8, st1);
        treeMap2.put(6.4, st2);
        treeMap2.put(7.2, st3);
        treeMap2.put(7.5, st4);
        treeMap2.put(7.9, st5);
        treeMap2.put(8.2, st6);
        treeMap2.put(9.1, st7);




    }
}
