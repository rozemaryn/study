public class Lesson16 {
}

class Car {
    String color;
    String engine;

    Car (String color, String engine) {
        this.engine = engine;
        this.color = color;
    }

    final static int a = 5;

    public Car abc (String color) {
        Car c10 = new Car(color, "V8");
        return c10;
    }

    public static void main(String[] args) {
        /* a = 10; — так нельзя, переменная final */
        Car c = new Car("brown", "V3");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.engine);
    }
}

class TestCar {
    final static Car c = new Car("pink", "V8");

    public static void main(String[] args) {
        /* c = new Car("black", "V8"); — так нельзя */

        c.color = "black";

        String st1 = "black";
        st1 = "red";

        boolean s1 = "red".regionMatches(1,"something",1, 1);
        System.out.println(s1);
    }
}
