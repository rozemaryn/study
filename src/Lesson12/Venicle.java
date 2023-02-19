package Lesson12;

public class Venicle {
    int engine_volume;
    int number_of_doors;

    Venicle(int engine, int number_of_doors) {
        this.engine_volume = engine;
        this.number_of_doors = number_of_doors;
    }
}

class VenicleTest {
    public static void main(String[] args) {
        Venicle v1 = new Venicle(3, 4);
        Venicle v2 = new Venicle(2, 5);

        if (v1.engine_volume > v2.engine_volume) {
            if (v1.number_of_doors > v2.number_of_doors) {
                System.out.println("V1 engine is more powerful and V1 has more doors that V2");
            } else {
                System.out.println("V1 engine is more powerful but V1 has less doors that V2");
            }
        } else {
            System.out.println("V1 engine is less powerful that V2");
        }
    }
}

