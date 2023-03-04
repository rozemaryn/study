package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList <Student3> ll = new LinkedList<>();

        Student3 st1 = new Student3("Zaur", 5);
        Student3 st2 = new Student3("Misha", 1);
        Student3 st3 = new Student3("Igor", 2);
        Student3 st4 = new Student3("Marina", 3);
        Student3 st5 = new Student3("Olga", 4);

        ll.add(st1);
        ll.add(st2);
        ll.add(st3);
        ll.add(st4);
        ll.add(st5);

        System.out.println(ll);
        System.out.println(ll.get(2));

        Student3 st6 = new Student3("Roman", 2);
        ll.add(0, st6);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

    }
}

class Student3 implements Comparable <Student3> {
    String name;
    int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student3 other) {
        return this.course-other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student = (Student3) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
