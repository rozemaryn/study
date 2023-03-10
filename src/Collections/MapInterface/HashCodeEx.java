package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        HashMap <Student, Double> map = new HashMap<>();
        Student st1 = new Student("Maria", "Kostianetskaia", 2);
        Student st2 = new Student("Zinaida", "Savelieva", 4);
        Student st3 = new Student("Kotya", "Kotovskiy", 5);

        map.put(st1, 9.5);
        map.put(st2, (double)7);
        map.put(st3, 10.0);

        Student st4 = new Student("Kotya", "Kotovskiy", 5);

//        boolean result = map.containsKey(st4);
//        System.out.println(result);

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        for (Map.Entry <Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() +": " + entry.getValue());
        }
    }
}

final class Student implements Comparable <Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo (Student s) {
        return this.name.compareTo(s.name);
    }
}
