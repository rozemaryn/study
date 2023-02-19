package Lesson24;

public class Test4 {
    public static void main(String[] args) {
        Jump_able j1 = new Human();
        Jump_able j2 = new Animal();
    }
}

class Human implements Jump_able {}

class Animal implements Jump_able {}

interface Jump_able {}

interface A2 {
    void abc();
}

interface B2 extends A2, Jump_able {
    void def ();
}

abstract class D implements B2 {}