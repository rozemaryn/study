package Lesson11.Homework;

import static Lesson11.Homework.Car.*;

public class Car {
    String color;
    String engine;
    int cardoor;

    public Car(String color, String engine, int cardoor) {
        this.color = color;
        this.engine = engine;
        this.cardoor = cardoor;
    }

    public static void doorchange (Car c1, int a) {
        c1.cardoor = a;
    }

    public static void colorswap (Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void showInfo(Car c1) {
        System.out.println(c1.color);
        System.out.println(c1.engine);
        System.out.println(c1.cardoor);
    }


}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("black", "V6", 5);
        Car c2 = new Car("white", "V5", 4);
        doorchange(c1, 4);
        doorchange(c2,2);

        colorswap(c1, c2);

        showInfo(c1);
        showInfo(c2);

    }
}
