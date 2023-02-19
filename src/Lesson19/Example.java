package Lesson19;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.println("Zero element is " + args[0]);
        System.out.println("Size of the array is " + args.length);
    }
}

class Test1 {
    public static void sum (String s, int [] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String ... args) {
        int a = 3;
        int b = 5;
        sum("String", null);
    }
}

class Test2 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        for (int a: array) {
            System.out.print(a + " ");
        }

        int sum = 0;

        for (int a: array) {
            sum += a;
        }

        System.out.println(sum);
    }
}

class Test5 {
    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"Math", "Philosophy"};

        for (String s: students
             ) {
            for (String s2: exams
                 ) {
                System.out.println(s + " " + s2);
            }
        }
    }
}

class Test6 {
    public static void main(String[] args) {
         int [][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[i].length; j++) {
//                 System.out.print(array[i][j] + " ");
//             }
//        }

        for (int[] array2: array
             ) {
            for (int j: array2
                 ) {
                System.out.print(j + " ");
            }
        }
    }
}

class Test7 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};

//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }

        for (int a: array
             ) {
            a = 3;
        }

        System.out.println(Arrays.toString(array));

    }
}

class Test8 {
    public static void main(String[] args) {
        String [] array = {"apple", "orange", "banana"};

        for (String s: array
             ) {
            s = new String("fruits");
        }

        System.out.println(Arrays.toString(array));

        StringBuilder sb1 = new StringBuilder("apple");
        StringBuilder sb2 = new StringBuilder("orange");
        StringBuilder sb3 = new StringBuilder("banana");

        StringBuilder [] array1 = {sb1, sb2, sb3};

        for (StringBuilder sb: array1
        ) {
            sb.append(" fruits");
        }

        System.out.println(Arrays.toString(array1));
    }
}

class Test9 {
    public static void main(String[] args) {
        int [] array = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = i*10;
            System.out.print(array[i] + " ");
        }

        for (int a: array
             ) {
            a = 10;
        }


    }
}

class Test10 {
    public static void main(String[] args) {
         int [] array = {3, 1, -2, 0};
         int [] array2 = {-9, 1, 5, 2};

         for (int i = 0; i < array.length && i < array2.length; i++){
             array[i] = 10;
             array2[i] = 2;
         }
    }
}
