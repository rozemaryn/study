package Practice.VariousTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task5 {
    public static void uniqueSymbol(String s) {
        HashMap<String, Integer> symbols = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int counter = 1;

            if (symbols.containsKey(String.valueOf(s.charAt(i)))) {
                symbols.put(String.valueOf(s.charAt(i)), ++counter);
            } else {
                symbols.put(String.valueOf(s.charAt(i)), counter);
            }
        }

        for (Map.Entry<String, Integer> entry : symbols.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry);
                break;
            }
        }
    }

    public static void main(String[] args) {
        uniqueSymbol("mgmfddl");
    }
}
