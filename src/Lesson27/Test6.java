package Lesson27;

public class Test6 {
    void abc () {
        System.out.println("abc is working");
        abc();
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.abc();
    }
}
