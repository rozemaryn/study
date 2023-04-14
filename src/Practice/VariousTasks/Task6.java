package Practice.VariousTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {
    public static ArrayList <String> sortList(List <String> list) {
        Collections.sort(list);
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

