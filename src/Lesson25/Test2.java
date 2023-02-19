package Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Human();
        Man m = new Man();
        Machine m2 = new Machine();
        if (j instanceof Jumpable) {
            System.out.println("j can jump");
        }
        if (m instanceof Human) {
            System.out.println("m is human");
        }
        // if (m2 instanceof Human) {
        //     System.out.println("smth"); — компилятор сразу на это ругается, пч такого быть не может

        if (m2 instanceof Jumpable) {
            System.out.println("smth");
        }
    }
}

interface Jumpable {}
class Human implements Jumpable{}
class Man extends Human{}
class Machine {}
