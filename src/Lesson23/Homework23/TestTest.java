package Lesson23.Homework23;

class X1 {}
class Y1 extends X1 {}

public class TestTest {
    public static void abc (X1 x, Y1 y) {
        System.out.println("Hi");
    }

    // это 2 overloaded метода; пч различается порядок аргументов

    public static void abc (Y1 y2, X1 x2) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Y1 a = new Y1();
        // abc(a, a); — непонятно, что вызывать
    }
}

class X2 {
    String s1 = "hi";
}

class Y2 extends X2 {
    boolean bool = false;
}

class TestX {
    public static void main(String[] args) {
        X2 x = new Y2 ();
        // System.out.println(x.s1 + " " + x.bool); — у класса X нет атрибута bool
    }
}
