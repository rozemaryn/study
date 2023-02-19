package Lesson8;

import java.sql.SQLOutput;

import static Lesson8.Homework8.*;

public class Homework8 {

    static final double Pi = 3.14;

    double CircleArea (double r) {
        double Circle = r*r*Pi;
        System.out.println("Circle area is " + Circle);
        return Circle;
    }

    static double CircumferenceLength (double r) {
        double Length = 2*r*Pi;
        System.out.println("Circumference length is " + Length);
        return Length;
    }

    void ShowInfo (double r) {
        System.out.println("Radius is " + r);
        CircumferenceLength(r);
        CircleArea(r);
    }
    static int Multiply(int a, int b, int c) {
        int result = a*b*c;
        System.out.println(result);
        return result;
    }

    // чтобы не занимать память, в методе выше можно не вводить переменную result, а сразу писать return a*b*c
    // а prinln уже тогда в main использовать

    static void Division(double a, double b) {
        System.out.println("Quotient is " + a/b + " and remainder is " + a%b);
    }

}

class Homework8Test {
    public static void main(String[] args) {
        Lesson8.Homework8.Multiply(113, 8,7);
        Division(123.4, 6.3);
        Division(75,3);
        Multiply(4,6,2);

        CircumferenceLength(6.1);

        Homework8 r1 = new Homework8();
        Homework8 r2 = new Homework8();

        r1.CircleArea(7);

        r1.ShowInfo(8);

        r2.CircleArea(2);

        r2.ShowInfo(2);

        CircumferenceLength(3);
    }
}
