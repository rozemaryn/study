package Lesson22;

import javax.sound.midi.Soundbank;

public class Homework22 {
}

class Scholar {
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder sb) {
        if (sb.length() > 2) {
            name = sb;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int i) {
        if (i > 0 && i < 5) {
            course = i;
        }
    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
        if (i > 0 && i < 11) {
        grade = i;}
    }

    public void showInfo () {
        System.out.println("Name is " + getName());
        System.out.println("Course is " + getCourse());
        System.out.println("Grade is " + getGrade());
    }
}

class ScholarTest {
    public static void main(String[] args) {
        Scholar s = new Scholar();
        s.setName(new StringBuilder("Francisc"));
        s.setCourse(4);
        s.setGrade(9);

        s.showInfo();
    }
}

class Animal {

    Animal () {
        System.out.println("I am an animal");
    }

    int eyes;

    public void eat () {
        System.out.println("Animal eats");
    }

    public void drink () {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet () {
        // super ();
        System.out.println("I am a pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    public void run () {
        System.out.println("Pet runs");
    }

    public void jump () {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog (String name) {
        super ();
        this.name = name;
        System.out.println("I am a dog and my name is " + name);
    }

    public void play () {
        System.out.println("Doggo plays");
    }
}

class Cat extends Pet {
    Cat (String name) {
        this.name = name;
        System.out.println("I am a kittie and my name is " + name);
    }

    public void sleep () {
        System.out.println("Kittie sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Pet dog = new Dog("Аристарх");
        System.out.println(dog.paw);
        System.out.println();

        Cat cat = new Cat("Alisa-kisa");
        cat.sleep();

    }
}
