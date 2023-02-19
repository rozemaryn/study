package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Profession2 p = new Profession2();
        p.eat();

        Teacher2 t = new Teacher2();
        t.eat();

        Profession2 p2 = new Teacher2();
        p2.eat();
    }
}

//class Food {}
//
//class Fruits extends Food {}
//
//class Profession2 {
//    String name;
//    int age;
//    int experience;
//    double salary = 100;
//
//    Food eat() {
//        System.out.println("Кушоц");
//        return new Food();
//    }
//
//    void sleep() {
//        System.out.println("Споть");
//    }
//}

class Teacher2 extends Profession2 {
    int NumberOfPupils;

    void teach() {
        System.out.println("УчЫт");
    }

    Fruits eat() {
        System.out.println("Учитель кушоц");
        return new Fruits();
    }
}


class A {
    Profession objectCreation () {
        return new Profession();
    }
}

class B extends A {
    Profession objectCreation () {
        return new Profession();
    }
}






