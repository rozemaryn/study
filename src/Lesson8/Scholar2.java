package Lesson8;

public class Scholar2 {
    String name;
    int course;
    static int count;
    int a;

    public Scholar2(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Scholar #" + count + " is created");
    }

    public static void ShowCount() {
        System.out.println("Total number of scholars is " + count);

    }

    public void ShowInfo() {
        System.out.println("Herzlich willkommen!");
    }

    void abc() {
        a++;
        count++;
    }

    // static void abcd() {
       // a++; — внутри статического метода нельзя использовать instance переменные. Пч для них нужен объект класса,
    // а его может ещё и не быть
    //}

    static void abcd() {
        Scholar2 s1 = new Scholar2("Meister",3);
        s1.a++;
    }

    public static void main(String[] args) {
        abcd();
        // abc(); не можем вызвать без создания объекта
    }
}


