package Lesson12;

public class Test12 {
    public static void main(String[] args) {
        int a = 10;
        int salary = 500;

        if (a < 20) {
            System.out.println("Variable a is less then 20");
            /* System.out.println("We need to use curly braces");
            a++;
            System.out.println(a);*/
        } else {
            System.out.println("Variable a is more then 20");
            System.out.println("Bracers motherfucker");
        }

        if (salary >= 1500) {
            System.out.println(":)");
    }

        else {
            System.out.println(":(");
        }
    }
}

class Test13 {
    public static void main(String[] args) {
        int salary = 1300;
        boolean b = true;

        if (salary < 200) {
            System.out.println("Salary is very low");
        } else if (salary < 400 && b == false || true) {
            System.out.println("Salary is so-so");
        } else if (salary < 600) {
            System.out.println("Salary is quiet good");
        } else {
            System.out.println("Salary is WOW!");
        }
        /* пример того, что условия могут быть не связаны */

        if (salary < 200) {
            System.out.println("Salary is very low");
        } else if (b == true) {
            System.out.println("Boolean is true");
        }
    }
}

class Test14 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a == b) {
            System.out.println("Varaible a is equal b");
        }
        else {
            System.out.println("Variable a is not equal b");
        }
    }
}
