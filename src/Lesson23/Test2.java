package Lesson23;

import Lesson10.p4.D;

public class Test2 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Profession p = new Profession();

        Profession p2 = new Driver();
        System.out.println(p2.name);
        System.out.println(p2.salary);
        System.out.println(p2.age);
        p2.eat();
        p2.sleep();
        // p2.drive(); — вот это уже нельзя вызвать


        // Driver d2 = new Profession(); — вот так нельзя
    }
}

class Profession {
    String name;
    int age;
    int experience;
    double salary = 100;

    void eat() {
        System.out.println("Кушоц");
    }

    void sleep() {
        System.out.println("Споть");
    }

    void SalaryRaise(Lesson22.Profession p) {
        p.salary = p.salary + 100;
    }
}


class Doctor extends Lesson23.Profession {
    String specialization;

    void cure() {
        System.out.println("ЛечЫт");
    }
}

class Teacher extends Lesson23.Profession {
    int NumberOfPupils;

    void teach() {
        System.out.println("УчЫт");
    }
}

class Driver extends Lesson23.Profession {
    String Car;

    void drive() {
        System.out.println("ВадЫт");
    }
}
