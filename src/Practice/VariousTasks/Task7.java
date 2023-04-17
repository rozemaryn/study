package Practice.VariousTasks;

/*
Инвертирование букв и слов. Написать программу,
которая инвертирует буквы каждого слова, и программу,
которая инвертирует буквы каждого слова и сами слова.
 */

import java.util.Arrays;

public class Task7 {
    public static String reverseSymbols(String word) {
        char [] symbols = new char[word.length()];

        int iterator = 1;

        for (int i = 0; i < word.length(); i++) {
            symbols[i] = word.charAt(word.length()-iterator);
            iterator++;
        }
        return new String (symbols);
    }

    public static void reverseWords(String [] array) {
        String[] reverse = new String[array.length];

        int iterator = 1;

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length-iterator];
            reverse[i] = reverseSymbols(reverse[i]);
            iterator++;
        }

        System.out.println(Arrays.toString(reverse));
    }

    public static void main(String[] args) {
        String s = "abcd";
        reverseSymbols(s);

        String[] array = {"ab", "abc", "abcd"};
        reverseWords(array);
    }
}
