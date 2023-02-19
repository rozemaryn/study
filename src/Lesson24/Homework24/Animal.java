package Lesson24.Homework24;

public abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish (String name) {
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("It's always interesting to watch fishes sleep");
    };

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings ");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak () {
        System.out.println("Somebody speaks");
    }
}

class Swordfish extends Fish {

    Swordfish (String name) {
        super(name);
        this.name = name;
    }

    public void swim () {
        System.out.println("Swordfish is a beatiful fish");
    }

    public void eat () {
        System.out.println("Swordfish isn't a predator");
    }
}

class Penguin extends Bird {

    Penguin (String name) {
        super(name);
        this.name = name;
    }


    public void sleep() {
        System.out.println("Penguins sleep hugging each other");
    }

    public void eat() {
        System.out.println("Penguin loves fish!");
    }

    public void fly() {
        System.out.println("Penguins can't fly!");
    }

    public void speak () {
        System.out.println("Penguins can't sing like nightingale");
    }
}

class Lion extends Mammal {
    Lion (String name) {
        super(name);
        this. name = name;
    }

    public void eat() {
        System.out.println("Lion loves meat like any other predator");
    }

    public void sleep () {
        System.out.println("Lion sleeps most part of the day");
    }

    public void run () {
        System.out.println("Lin is not the fastest one among the feline family");
    }
}

class ExecuteHomework {
    public static void main(String[] args) {
        Swordfish sf = new Swordfish("Dagger");
        System.out.println(sf.name);
        sf.swim();
        sf.eat();
        sf.sleep();
        System.out.println();

        Speakable sp = new Penguin("Blacky");
        sp.speak();
        // sp.fly(); // можно вызвать только методы интерфейса, методы класса Пингвин — уже низзя
        System.out.println();

        Animal al = new Lion("Leva");
        System.out.println(al.name);
        al.sleep();
        al.eat();
        System.out.println();

        Mammal ml = new Lion ("Leva2");
        System.out.println(ml.name);
        ml.sleep();
        ml.eat();
        ml.run();
        ml.speak();
    }
}





