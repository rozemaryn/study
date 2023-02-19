package Lesson26;

import java.sql.SQLOutput;

public class Test5  {
    {
        System.out.println("Погнали"); // вот это initializator, срабатывает каждый раз при создании нового объекта
    }

    static {
        System.out.println("This's a static initializer");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
    }
}
