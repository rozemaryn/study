package Lesson18;

import java.util.Arrays;

public class Homework18 {

    public static void sort(int[] array) {
        int index = 0;

        while (index != array.length) {
            int min = array[index];
            int minIndex = index;

            for (int i = index; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }

            int temp = array[index];
            array[index] = min;
            array[minIndex] = temp;

            index++;
        }

        Arrays.stream(array).forEach(e -> System.out.println(e));

    }


    public static void main(String[] args) {
        int[] array = {4, 7, 0, -3, -11, 4, 8};
        sort(array);
    }
}

class BubbleExample {
    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

class Task2 {

    public static void showArray(String[][] array) {
        System.out.print(Arrays.deepToString(array));

    }

    public static void main(String[] args) {
        String[][] array1 = {{"First"}, {"Second"}};
        showArray(array1);
    }
}


class Task2ver2 {
    public static void showArray(String[][] array) {

        int k = -1;

        for (int i = 0; i < array.length; i++) {
            k++;
            for (int j = 0; j < array[k].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[][] array1 = {{"First" }, {"Second", "Anything", "Else"}, {"Net", "Check", "Kot'ka"}, {"Fourth"}};
        showArray(array1);

    }
}