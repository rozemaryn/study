package Lesson13;

public class Test1 {
}

class Student13 {
    int grade;

    Student13(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student13 st1 = new Student13(2);

        /* if (st1.grade == 2) {
            System.out.println("Bad, bad student");
        } else if (st1.grade == 3) {
            System.out.println("Student can do much better than this");
        } else if (st1.grade == 4) {
            System.out.println("Student is doing all right");
        } else if (st1.grade == 5) {
            System.out.println("Subarashi!!");
        } else {
            System.out.println("Data is incorrect");
        } */

        switch (st1.grade) {
            case 2:
                System.out.println("Bad, bad student");
                break;
            case 3:
                System.out.println("Student can do much better than this");
                break;
            case 4:
                System.out.println("Student is doing all right");
                break;
            case 5:
                System.out.println("Subarashi!!");
                break;
            default:
                System.out.println("Data is incorrect");
        }
    }
}
