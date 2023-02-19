package Lesson6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(int z, int y) {
        System.out.println(z);
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show (String s) {
        System.out.println(s);
        System.out.println("Data type is String");
    }

    void show(String s, int a) {
        System.out.println("String " + s + " int " + a);
    }

    void show(int a, String s) {
        System.out.println("Goryat kostry ryabin");
    }
}

class OverloadTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show(100);

        int a = 500;
        mO.show(a);

        boolean b = false;
        mO.show(b);

        String s1 = "Calendar' perevernu";
        mO.show(s1);

        mO.show("Slysh' rabotat'", 13);

        mO.show(25, "Hoba");
    }
}