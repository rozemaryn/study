package Lesson22;

public class Test4 {
}

class Human4 {

    Human4 () {
        System.out.println();
    }

    Human4(String n) {
        this(n, null);
    }

    Human4(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;
}

class Student2 extends Human4 {

    Student2() {
        this(5);
        System.out.println("Hello");
    }

    Student2(int i) {
        super("Petya");
    }

    public static void main(String[] args) {
        Human4 s = new Student2(8);
        System.out.println(s.name);

    }
}

class Human5 {

    String name;
    String surname;

    Human5(){}
}

class Child extends Human5 {
    int age;

    Child(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {

        Child c = new Child("Igorek", "Pupkin", 3);
        System.out.println(c.name);
    }
}

