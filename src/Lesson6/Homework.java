package Lesson6;

public class Homework {

    int sum() {
        System.out.println(0);
        return 0;
    }

    int sum(int a) {
        System.out.println(a);
        return a;
    }

    int sum(int a, int b) {
        System.out.println(a+b); // вот так не оч верно, пч сумма считается 2 раза, лучше вводить переменную result
        return a + b; // либо писать void вместо int, и оставить в теле только sout
    }

    int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return a + b + c + d;
    }
}

class HomeworkTest {
    public static void main(String[] args) {
        Homework h = new Homework();

        h.sum();

        h.sum(1);

        h.sum(3, 7);

        h.sum(56, 98, 1345);

        h.sum (567, -346, 674, -56);
    }
}
