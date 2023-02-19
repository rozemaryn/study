package Lesson14;

public class Test3 {
    public static void main(String[] args) {
        int a = 15;
        if (a > 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            if (i%55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
