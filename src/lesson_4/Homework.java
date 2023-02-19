package lesson_4;

public class Homework {
}

class Student {
        String id;
        String name;
        String surname;
        int course;
        double math;
        double econom;
        double language;

        double SredneeArif(){
            double result = (math + econom + language)/3;
            return result;
        }
}

class StundentTest {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();

        stud1.id = "13472369";
        stud1.name = "Sasha";
        stud1.surname = "Chyornyi";
        stud1.course = 1;
        stud1.math = 3;
        stud1.econom = 2.5;
        stud1.language = 5;

        stud2.id = "13586";
        stud2.name = "Anna";
        stud2.surname = "Ahmatova";
        stud2.course = 3;
        stud2.math = 2.2;
        stud2.econom = 3.5;
        stud2.language = 5;

        stud3.id = "58964";
        stud3.name = "Dmitriy";
        stud3.surname = "Lobachevskiy";
        stud3.course = 2;
        stud3.math = 5;
        stud3.econom = 4.4;
        stud3.language = 3.7;

        double SrArif1 = stud1.SredneeArif();
        double SrArif2 = stud2.SredneeArif();
        double SrArif3 = stud3.SredneeArif();

        System.out.println(SrArif1);
        System.out.println(SrArif2);
        System.out.println(SrArif3);
    }
}