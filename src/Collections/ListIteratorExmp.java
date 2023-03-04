package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExmp {
    public static void main(String[] args) {

        // проверяем, паллиндром или нет
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        System.out.println(list);

        /* создаём 2 итератора, первый обычный
        второй будет идти с конца, что мы указываем в параметре (list.size),
        что он с 5 элемента пойдёт
        */

        ListIterator <Character> lit = list.listIterator();
        ListIterator <Character> reverseLit1 = list.listIterator(list.size());

        boolean isPallindrome = true;
        while (lit.hasNext() && reverseLit1.hasPrevious()) {
            if (lit.next() != reverseLit1.previous()) {
                isPallindrome = false;
                break;
            }
        }

        if (isPallindrome) {
            System.out.println("It's a pallindrome");
        }
        else {
            System.out.println("It's NOT a pallindrome");
        }
    }
}
