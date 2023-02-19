package Lesson22.p2;

import Lesson22.*;

public class ProtectedStudent extends human3 {

    public static void main(String[] args) {
        ProtectedStudent s = new ProtectedStudent();
        System.out.println(s.name);
        s.work();
        ProtectedStudent.rest();

        human3 h = new human3();
        human3.rest();
        System.out.println(human3.salary);
        }

    }

