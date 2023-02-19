package Lesson6;

public class Student {

    int id;
    String name;
    String surname;
    int course;
    double math;
    double econom;
    double language;

    Student(int id2, String name2, String surname2, int course2, double math2, double econom2, double language2) {
        id = id2;
        name = name2;
        surname = surname2;
        course = course2;
        math = math2;
        econom = econom2;
        language = language2;
    }

    Student(int id3, String name3, String surname3, int course3) {
        this(id3, name3, surname3, course3, 0.0, 0.0, 0.0);
    }

    Student() {
        this(0, null, null, 0, 0.0, 0.0, 0.0);
    } // вот тут не надо было никакой конструктор вызывать, и так дефолтные значения всё подставляются

    void ShowInfo () {
        System.out.println(id + " " + name + " " + surname + " " + course + " math " + math + " economics " + econom + " language "
                + language );
    }
}

class StundentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(2, "Bestia", "Izgoevna", 3);
        Student s3 = new Student(3, "Jaks", "Albov", 5, 5, 4, 3);

        s1.ShowInfo();
        s2.ShowInfo();
        s3.ShowInfo();
    }
}
