package Lesson9;

public class AnotherCar {

    int dfjge93jfdfngkjdgkdbgkdgkjdngkdn; // примеры того, как можно называть идентификаторы
    int Zyx;
    int $;
    int _underscore_;


    public static int a;
    String color; // instance переменная
    String engine;
    static int count;


    public AnotherCar(String color, String engine) {
        int x = 10;
        int y = x + 10;
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void ShowColor() {
        System.out.println("Car's color is " + color);
    }

    public void ChangeColor (String color3) {
        String a = color3;
        System.out.println("Car's color have changed");
        int price = 5000;
        this.color = color3; // this всегда имплицитно подразумевается
        price += 1000;
    }

    public void ColorExample (String color) {
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        AnotherCar Ferrari = new AnotherCar("red", "V66");
        Ferrari.ColorExample("black");
        System.out.println(Ferrari.color);
    }

    }
