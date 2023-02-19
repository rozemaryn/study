package Lesson26;

import Lesson7.C;

import java.util.ArrayList;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = null;
        Car c3 = new Car("black", "V8");

        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Car c4 = new Car("black", "V8");
        System.out.println(list.contains(c4));

        // System.out.println(c2.equals(c1));
        System.out.println(list);
    }
}

class Car extends Object {

    String colour;
    String engine;

    Car (String colour, String engine) {
        this.colour = colour;
        this.engine = engine;
    }

    public boolean equals (Object obj) {
        if (obj instanceof Car) { // проверяем, принадлежат ли объект к одному классу
            Car c2 = (Car)obj; // делаем кастинг, пч у obj нет нужных атрибутов, цвета и мотора
            return (colour.equals(c2.colour) && engine.equals(c2.engine)); // возвращаем результат сравнения параметров
        }
            else {
                return false;
            }
        }

        public String toString() {
        return "Car's colour is " + colour + " and it's engine is " + engine;
        }

//    public boolean equals (Car c) {
//        return (colour.equals(c.colour) && engine.equals(c.engine));
//    }

    }


