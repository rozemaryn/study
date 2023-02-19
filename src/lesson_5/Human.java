package lesson_5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Imya " + name + " cvet mashini " + car.color + " Balans karty " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red","V8");
        h.bA = new BankAccount(1,25678.13);
        h.info();
    }
}

class Car3{
    Car3 (String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
BankAccount(int id2, double balance2){
 id = id2;
 balance = balance2;
}
    int id;
    double balance;
}

