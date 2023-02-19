package lesson_5;

public class Car2 {
    String colour;
    String engine;
    int speed;

    int gaz(int gazui) {
        speed += gazui;
        return speed;
    }

        int tormoz(int stope){
            speed += stope;
            return speed;
    }

    void ShowInfo() {
        System.out.println("Цвет — " + colour + " Мотор — " + engine + "Скорость — " + speed);
    }
        }



class Car2Test{
    public static void main(String[] args) {
        Car2 tachka = new Car2();

        int FasterSpeed = tachka.gaz(100);
    }
}