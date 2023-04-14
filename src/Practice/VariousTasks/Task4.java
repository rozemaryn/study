package Practice.VariousTasks;

import java.util.HashMap;

public class Task4 {
    /*
    Подсчет повторяющихся символов. Написать программу, которая подсчитывает
    повторяющиеся символы в заданной строке.
     */

    public static void sameSymbols(String s) {
        HashMap <String, Integer> symbols = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int counter = 1;

            if (symbols.containsKey(String.valueOf(s.charAt(i)))) {
                symbols.put(String.valueOf(s.charAt(i)), ++counter);
            } else {
                symbols.put(String.valueOf(s.charAt(i)), counter);
            }
        }

        System.out.println(symbols);
    }

    public static void main(String[] args) {
        sameSymbols("mama");
    }
}
