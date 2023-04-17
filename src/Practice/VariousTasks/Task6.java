package Practice.VariousTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Create a method that takes a string list as a parameter,
then returns the list sorted alphabetically from Z to A.
 */

public class Task6 {
    public static ArrayList <String> sortList(List <String> list) {
        list.sort(Collections.reverseOrder());
        return (ArrayList<String>) list;
    }

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("B");
        list.add("Z");
        list.add("Y");
        list.add("A");

        ArrayList <String> list2 = sortList(list);
        System.out.println(list2);

    }
}
/*
do the same, but case insensitive
 */


class Task6CaseInsensitive {
    public static ArrayList <String> sortList(List <String> list) {
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(list);
        return (ArrayList<String>) list;
    }

    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("B");
        list.add("z");
        list.add("Y");
        list.add("A");
        list.add("Z");

        ArrayList <String> list2 = sortList(list);
        System.out.println(list2);
    }
}

