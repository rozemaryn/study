package Lesson26;

import java.sql.SQLOutput;

public class Test7 {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Lion l = new Lion();
        System.out.println();
        Lion l2 = new Lion();
    }
}

class Animal {
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static {
        System.out.println("Static init in Animal");
    }
    {
        System.out.println("Non-static init in Animal");
    }
}

class Mammal extends Animal {
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static {
        System.out.println("Static init in Mammal");
    }
    {
        System.out.println("Non-static init in Mammal");
    }
}

class Lion extends Mammal {
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static {
        System.out.println("Static init in Lion");
    }
    {
        System.out.println("Non-static init in Lion");
    }
}

class X {
    static String s ="";
    {s += "A";}
    static {s +="B";}
    {s += "C";}
}

class Z {
    public static void main(String[] args) {
        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }
}


