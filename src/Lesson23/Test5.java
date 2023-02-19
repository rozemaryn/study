package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Teacher3 t = new Teacher3();
        t.sleep();

        Profession2 p = new Teacher3();
        p.sleep();

        System.out.println(t.salary);
        System.out.println(p.salary);
    }
}

class Food {}

class Fruits extends Food {}

class Profession2 {

    String name;
    int age;
    double salary = 100;

    Food eat() {
        System.out.println("Кушоц");
        return new Food();
    }

    void sleep() {
        System.out.println("Споть");
    }
}

class Teacher3 extends Profession2 {
    String salary = "Two hundred";
    int NumberOfPupils;

    void teach() {
        System.out.println("УчЫт");
    }

    Food eat() {
        System.out.println("Кушоц");
        return new Food();
    }

    // @Override — Java будет ругаться, пч static метод
    void sleep() {
    System.out.println("Споть учитель");} // это не перезаписанный, а новый метод, пч private (был private, уже убрала)
}

final class T {}

// class P extends T {}


