package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.firstAid();

        Swim_able t = new Driver();
        t.swim();
        // t.drive(); так нельзя, пч этого метода нет в интерфейсе

    }
}

class Employee {
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

class Teacher extends Employee implements Help_able {
    int NumberOfPupils;
    void teach() {
        System.out.println("УчЫт");
    }

    public void firstAid() {
        System.out.println("Teacher helps");}

    public void extinguishFire(String s) {
        System.out.println("Teacher tushit'");
        System.out.println(a); // показывать можно
        // a = 10; // изменять нельзя, пч константа
}
}

class Driver extends Employee implements Help_able, Swim_able {
    String Car;

    void drive() {
        System.out.println("ВадЫт");
    }

    public void firstAid() {
        System.out.println("Driver helps");}

    public void extinguishFire(String s) {
        System.out.println("Driver tushit'");
    }

    public void swim() {
        System.out.println("Driver swims");
    }
}

interface Help_able {
    void firstAid();
    void extinguishFire(String object);

    int a = 10;
}

interface Swim_able {
    void swim();
}

