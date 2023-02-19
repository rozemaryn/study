package Lesson8;

public class Car {
    String colour = "blue";
    String engine = "V7";
}

class Human {
    String name = "Igor";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c.engine = "V8";
    }
}
