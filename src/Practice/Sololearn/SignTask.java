package Practice.Sololearn;

import java.util.*;

public class SignTask {
    public static boolean isPallindrome (String s1) {
        List<Character> signs = new LinkedList<>();

        for (int i = 0; i < s1.length(); i++) {
            signs.add(s1.charAt(i));
        }

        ListIterator<Character> lit = signs.listIterator();
        ListIterator <Character> reverselit = signs.listIterator(signs.size());

        boolean isPallindrome = true;

        while (lit.hasNext() && reverselit.hasPrevious()) {
            if (lit.next() != reverselit.previous()) {
                isPallindrome = false;
                break;
            }
        }
        return isPallindrome;
    }

    public static String checkSigns(String[] array) {
        for (String s : array) {
            if (isPallindrome(s))
                return "Open";
        }
        return "Trash";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] signs = new String[4];

        for (int i = 0; i < signs.length; i++) {
            System.out.println("Please enter word");
            signs[i] = sc.nextLine();
        }

        System.out.println(checkSigns(signs));
    }
}
