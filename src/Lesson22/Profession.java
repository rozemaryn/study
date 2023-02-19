package Lesson22;

import java.sql.SQLOutput;

public class Profession extends java.lang.Object {
    String name;
    int age;
    int experience;
    public double salary = 100;

    void eat() {System.out.println("Кушоц");}

    void sleep() {
        System.out.println("Споть");
    }

    void SalaryRaise (Profession p) {
        p.salary = p.salary + 100;
    }
}


class Doctor extends Profession {
    String specialization;
    void cure() {
        System.out.println("ЛечЫт");
    }
}

class Teacher extends Profession {
    int NumberOfPupils;
    void teach() {
        System.out.println("УчЫт");
    }
}

class Driver extends  Profession {
    String Car;
    void drive() {
        System.out.println("ВадЫт");
    }
}

class Test2 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Tamara";
        doc.eat();
        doc.sleep();
        doc.specialization = "Pediatr";

        doc.SalaryRaise(doc);
        System.out.println(doc.salary);

    }
}

class Human2 {

    private String name = "Vasya";

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }


    private static int salary = 150;

    private void work() {
        System.out.println("Слышь работать");
    }

    private static void rest() {
//        System.out.println("На чиле, на расслабоне");
//    }
    }
}


