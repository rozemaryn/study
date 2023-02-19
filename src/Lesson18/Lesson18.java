package Lesson18;

import java.util.Arrays;

public class Lesson18 {

    public static void main(String[] args) {
        int [] array1 = {0, 5, -1, 2, 5};
        String [] array2 = {"kotya", "kokokotya", "kooootyaaaaa"};
        int [] [] array3 ={ {0, 1, 5}, {2, 7, 6}, {-1,3}};

        array1 [1] = 10;
        System.out.println(array1[1]);
        System.out.println(array2[2]);
        System.out.println(array3[1][2]);

        char [][][] array4 = {{{'a', 'b'}, {'c', 'd'}, {'e','f'}}, {{'g', 'h'}, {'i', 'j'}, {'k', 'l'}}};
        System.out.println(array4[1][1][1]);
    }
}

class Test1 {
    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double [][] array3;

        array1 = new int [8];
        array2 = new String [3];
        array3 = new double[4][2];
        System.out.println(array3[0][0]);

        System.out.println(array3.length);

        array2 [0] = "pizza";
        array2 [2] = "kus'na";

        array3 [0] [0] = 6.66;

        double [] array5;
        array5 = new double [2];
        array5 [0] = 2.5;
        array5 [1] = 3.5;

        array3 [1] = array5;

        double [] array7;
        array7 = new double[2];
        array7 = array5;

        System.out.println(array7[1]);
    }
}

class Test3 {
    public static void main(String[] args) {
        int [] array, a;
        int b [], c;
        int []d, e [][];

        String array1 [];
        int [] array2 [];
        String [][] array22 [];

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Element" + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.println(array2[i][j]);
            }
        }
    }
}

class Test4 {
    static String s;

    public static void main(String[] args) {
        int[] array1;
        array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        // array1 [3] = 4;

        int [][] array2 = new int [3][];
        // System.out.println(array2[0][1]);

        System.out.println(s.length());
    }
}

class Test5 {
    public static void main(String[] args) {
        int [] array1 = {1, 9, 3, -8, 0, 5, 4, 1};

        int index1 = Arrays.binarySearch(array1, -8);
        System.out.println(index1);

        Arrays.sort(array1);

        for (int i=0; i <array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        int index2 = Arrays.binarySearch(array1, 10);
        System.out.println(index2);

        System.out.println(array1);
    }
}

class Test6 {
    public static void main(String[] arrrr) {
        int [] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int [] array2 = {1, 9, 3, -8, 0, 5, 4, 1};
        int [] array3 = array2;

        array1 [0] = 1;
        array1 [5-2] = 3;
        array1 [array1.length] = 10;

        System.out.println(array1==array2);

        int [] array4 = new int [] {};
    }
}

class Test7 {
    public static void MaxMin(double[] array1) {
        double max = array1[0];
        double min = array1[0];

        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("Minimum is " + min + " and maximun is " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        MaxMin(array1);
        MaxMin(new double [] {-2.5, 3});
    }
}

class Test8 {
    public static void main(String[] args) {
        char[] array1 = {'h', 'i', 'b', 'e', 'r', 'n', 'a', 't', 'e'};
        String s1 = new String(array1);
        System.out.println(s1);

        StringBuilder sb1 = new StringBuilder("Ustal'");
        sb1.append(array1, 2, 3);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Kotovski");
        sb2.insert(1, array1, 2, 3);
        System.out.println(sb2);

    }
}
