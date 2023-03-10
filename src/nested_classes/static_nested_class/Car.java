package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method () {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // пример того, что интерфейс может быть вложенным, и внутри него могут быть классы
    interface someInterface {
        public static class Exmp {
        }
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        Engine (int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a); // можем обратиться к статическим элементам
            //System.out.println(doorCount); — и не можем к non-static
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("black", 2, engine);

        // Car.Engine engine2 = new car.Engine(256);
    }
}
