package Collections.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExmp {
    public static void main(String[] args) {
        Queue <String> qu = new LinkedList<>();
        qu.add("Zaur");
        qu.add("Nail'");
        qu.add("Natasha'");
        qu.offer("Gena");
        qu.offer("Will");

        System.out.println(qu);

        System.out.println(qu.remove());
        System.out.println(qu.element());

        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.remove());
        System.out.println(qu.poll());


    }
}
