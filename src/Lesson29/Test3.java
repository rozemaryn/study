//package Lesson29;
//
//import java.util.ArrayList;
//
//public class Test3 {
//
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student (String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void print(Student st) {
//        System.out.println("Name is " + st.name + ", sex is " + st.sex + ", age is " + st.age + ", " +
//                "course is " + st.course + ", grade is " + st.avgGrade);
//    }
//
//    void filter(ArrayList<Student> list, StudentChecks sc) {
//        for (Student s : list) {
//            if (sc.testStudent(s)) {
//                print(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList <Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
//        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
//        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
//        Student st4 = new Student("Petr", 'm', 35, 4, 7);
//        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//
//        StudentInfo si = new StudentInfo();
//        si.filter(list, (Student st) -> {return st.avgGrade > 8.5;});
//
//        si.filter(list, (st) -> {int z = 5; return st.avgGrade > 7;});
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent (Student s);
//}
//
//
