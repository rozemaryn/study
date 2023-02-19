package lesson_5;

public class CarConstruct {
}

class Car {
    Car(String cvet, String motor){
        color = cvet;
        engine = motor;
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("yellow", "V4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
