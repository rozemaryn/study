package Lesson11;

import java.util.Objects;

public class Pupil {
    public String name;
    public int course;
    public double grade;

    public Pupil(String name, int course, double grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
    }

    public static void swap (Pupil pup1, Pupil pup2) {
        Pupil pup3 = pup1;
        pup1 = pup2;
        pup2 = pup3;
        System.out.println(pup1.name);
    }

    public static void changename (Pupil p1) {
        p1.name = "Vasyan";
    }

    public static void main(String[] args) {
        Pupil p1 = new Pupil("Ivan", 3, 9.5);
        Pupil p2 = new Pupil("Petya", 1, 5.1);

        swap(p1, p2);
        System.out.println(p1.name);

        changename(p2);
        System.out.println(p2.name);
    }

}
