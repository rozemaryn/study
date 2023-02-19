package Lesson19;

import java.util.Arrays;
import java.util.Objects;

public class Homework19 {
    public static void abc(String[] args, String[]... array) {

        String[][] array2 = array;

        // вот тут я сравниваю значения массивов args и array
        // varargs String[]... array Java считает как двухмерный массив

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // вот тут традиционный for, чтобы перезаписать значения
                for (String arg : args) {
                    if (arg.equals(array[i][j])) { // String корректнее сравнивать через equals, хотя здесь почему-то у меня сработало ==ja
                        array[i][j] = null;
                        continue;
                    }
                }
                System.out.println(array[i][j]);
            }
        }


//        for (String[] s : array) {
//            for (String s2 : s) {
//                System.out.println(s2);
//            }
//        }
    }


    public static void main(String[] args) {
        args = new String[]{"S1", "S5"}; // вот тут Д мне подсказала, что с массивом args тоже можно работать

        abc(args, new String[]{"S1", "S2", "S3"});
    }
}
