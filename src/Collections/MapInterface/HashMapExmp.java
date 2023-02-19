package Collections.MapInterface;

import java.util.HashMap;

public class HashMapExmp {
    public static void main(String[] args) {
        HashMap <Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Maria Kostianetskaia");
        map1.put(5734095, "Somebody Somebody");
        map1.put(9755394, "Anonim Anonimych");
        // map1.put(9755394, "Double Double");
        map1.put(null, null);
        map1.putIfAbsent(1000, "Mary Lin");

        System.out.println(map1.get(9755394));
        map1.remove(9755394);

        System.out.println(map1.containsKey(1000));
        System.out.println(map1.containsValue("Mary lin"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());

    }
}
