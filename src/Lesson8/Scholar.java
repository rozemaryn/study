package Lesson8;

public class Scholar {
    String name;
    int course;
    static int count;

    public Scholar(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Scholar #" + count + " is created");
    }

    ;

    public static void ShowCount() {
        System.out.println("Total number of scholars is " + count);
    }

}

class ScholarTest {
    public static void main(String[] args) {
        Scholar St1 = new Scholar("Frederic", 2);
        Scholar St2 = new Scholar("Mariahna", 1);
        Scholar St3 = new Scholar("Hulio", 4);

        System.out.println(St2.count);
        System.out.println(St3.name);
        Scholar.ShowCount(); // static методы можно вызывать без создания объектов
    }
}
