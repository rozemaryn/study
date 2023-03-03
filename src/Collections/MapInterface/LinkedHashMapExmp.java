package Collections.MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExmp {

    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm = new LinkedHashMap(16, 0.75f, true);

        Student st1 = new Student("Maria", "Kostianetskaia", 2);
        Student st2 = new Student("Zinaida", "Savelieva", 4);
        Student st3 = new Student("Kotya", "Kotovskiy", 5);
        Student st4 = new Student("Ivan", "Petrov", 2);

        lhm.put(7.2, st1);
        lhm.put(7.5, st2);
        lhm.put(5.8, st3);
        lhm.put(6.4, st4);

        lhm.get(7.2);
        lhm.get(5.8);

        System.out.println(lhm);

    }
}
