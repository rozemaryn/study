package Lesson12;

public class Test15 {

    public static void maximum(int a, int b, int c) {
        if (a > b && a > c) {
            int d = 5;
            System.out.println("A is the biggest number");
        } else if (b > a && b > c) {
            int d = 10;
            System.out.println("B is the biggest number");
        } else {
            System.out.println("C is the biggest number");
        }
    }

    void abc() {
        int a = 10;
        String str;
        if (a >= 10) {
            str = "Hi";
        }
        if (a < 10) {
            str = "Bye";
        }
        else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        maximum(23, 67, 22);

        int a = 10;
        int b = 20;
        int max = (a>b)?a:b;
        System.out.println(max);

    }
}
