package Lesson12;

import Lesson11.Pupil;

public class PupilCompare {

    public static void compare_pupil(Pupil p1, Pupil p2) {
        if (p1.name.equals(p2.name) && p1.course == p2.course && p1.grade == p2.grade) {
            System.out.println("Pupil p1 is equal to pupil p2");
        } else {
            System.out.println("Pupil p1 is not equal to pupil p2");
        }
    }

    public static void compare_attributes(Pupil p1, Pupil p2) {
        if (p1.name.equals(p2.name)) {
            if (p1.course == p2.course) {
                if (p1.grade == p2.grade) {
                    System.out.println("Pupil p1 is equal to pupil p2");
                } else {
                    System.out.println("Grades of pupils are not equal");
                }
            } else {
                System.out.println("Courses of pupils are different");
            }
        } else {
            System.out.println("Pupils are different people");
        }
    }

    public static void main(String[] args) {
        Pupil p1 = new Pupil("Ivan", 3, 9.5);
        Pupil p2 = new Pupil("Petya", 3, 9.5);
        compare_pupil(p1, p2);
        compare_attributes(p1, p2);
    }
}
