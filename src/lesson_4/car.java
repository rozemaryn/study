package lesson_4;

import org.w3c.dom.ls.LSOutput;

public class car {

    String color = "red";
    String engine = "V6";
}

class car_test {
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = car1;
        car1.color = "blue";
        car1.engine = "B8";

        System.out.println("Cvet "+ car1.color);
        System.out.println("Motor " + car1.engine);
    }
}

class test_niti {
    public static void main(String[] args) {
        String name = "Masha";
        String name2 = new String("Mashunya");

        System.out.println(name2);
    }
}
