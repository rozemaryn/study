package Lesson24;

public class Test5 {
}

interface I1 {
    void abc();
    default void def() {
        System.out.println("This is method def");
    }
    static void ghi() {
        System.out.println("This is static method");
    }
}

interface I4 {
    static void ghi() {
        System.out.println("This is static method 2");
    }
}

class Z2 implements I1 {
    @Override
    public void abc() {
        System.out.println("this is overriden method abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        I1.ghi();

    }
}

interface I2 {
    default void abc() {
        System.out.println("Second method abc");
    }
}

interface I3 extends I2  {
    void abc();
}