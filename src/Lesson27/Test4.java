package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4, 8, 1};
        System.out.println("We have an array");

        try { // в этом блоке то, что мы пытаемся сделать
        System.out.println(array[5]); // на этом этапе уже ловим exception и try заканчивается
        System.out.println("Have a good day");
        }
        catch (ArrayIndexOutOfBoundsException e) { // здесь мы указываем тип объекта (AIOOB) и имя переменной
            // через имя e потом можно с ней работать
            System.out.println("Exception was catched: " + e); // если пойманный exception подходит по типу,
            // то выполняется данный код
        }

        finally {
            System.out.println("It'a finally block");
        }
        System.out.println("Some other code");
    }
}

class Test5 {

    void abc() {
        int[] array = {1, 3};
        System.out.println(array[5]);
    }


    void def() throws IndexOutOfBoundsException {
        System.out.println("превед");
        abc();
    }

    public static void main(String[] args) throws Exception {
        Test5 t = new Test5();
        try {
            t.def();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}