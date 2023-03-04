package Collections.Queue_Interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExmp {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
    }
}

class PriorityQueueExmp2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olga", 4);

        PriorityQueue <Student> exmp2 = new PriorityQueue<>();
        exmp2.add(st1);
        exmp2.add(st2);
        exmp2.add(st3);
        exmp2.add(st4);
        exmp2.add(st5);

        System.out.println(st1.compareTo(st2));

        System.out.println(exmp2.poll());
        System.out.println(exmp2.poll());
        System.out.println(exmp2.poll());
        System.out.println(exmp2.poll());
        System.out.println(exmp2.poll());




    }
}

class Student implements Comparable <Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
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
