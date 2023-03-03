package Collections.MapInterface;

import java.util.Hashtable;

public class HashTableExmp {
    public static void main(String[] args) {
        Hashtable <Double, Student> ht = new Hashtable<>();

        Student st1 = new Student("Maria", "Kostianetskaia", 2);
        Student st2 = new Student("Zinaida", "Savelieva", 4);
        Student st3 = new Student("Kotya", "Kotovskiy", 5);
        Student st4 = new Student("Ivan", "Petrov", 2);

        ht.put(7.2, st1);
        ht.put(7.5, st2);
        ht.put(5.8, st3);
        ht.put(6.4, st4);
        // ht.put(null, st4); — нельзя добавлять null

        System.out.println(ht);
    }
}
