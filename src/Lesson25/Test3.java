package Lesson25;

import Lesson10.p4.D;

public class Test3 {
    public static void main(String[] args) {

        Profession25 p1 = new Doctor25();
        Profession25 p2 = new Driver25();
        Profession25 p3 = new Teacher25();
        Profession25 p4 = new Profession25();

        Test3 t = new Test3();

        Doctor25 d1 = (Doctor25)p1;
        System.out.println(d1.specialization);
        // System.out.println(((Doctor25) p2).specialization);

        Helping h = new Doctor25();
        System.out.println(((Doctor25) h).specialization);

//        System.out.println(p==p1); // вот так можно
//        System.out.println(p==t);

        //        Doctor25 d1 = (Doctor25)p4;
//        d1.cure();
//        System.out.println(d1.specialization);

//        Profession25 [] array = {p1, p2, p3, p4};
//
//        for (Profession25 p: array)
//        {if (p instanceof Driver25) {
//            System.out.println(((Driver25)p).Car);
//            ((Driver25)p).drive();
//        }
//
//        }


    }
}

class Profession25 {
    String name;
    int age;
    int experience;
    public double salary = 100;

    void eat() {System.out.println("Кушоц");}

    void sleep() {
        System.out.println("Споть");
    }

    void SalaryRaise (Lesson22.Profession p) {
        p.salary = p.salary + 100;
    }
}


class Doctor25 extends Profession25 implements Helping {
    String specialization;
    public void help () {
        System.out.println("Doctor cures people");
    }
    void cure() {
        System.out.println("ЛечЫт");
    }
}

class Teacher25 extends Profession25 {
    int NumberOfPupils;
    void teach() {
        System.out.println("УчЫт");
    }
}

class Driver25 extends Profession25 {
    String Car = "Mercedez";
    void drive() {
        System.out.println("ВадЫт");
    }
}

interface Helping {
    void help();
}

