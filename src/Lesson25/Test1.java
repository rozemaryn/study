package Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();

        Employee [] array3 = {emp1, emp2};

        for (Employee emp: array3) {
            emp.work();
        }

        String s1 = null;

        System.out.println(s1 instanceof String);


    }
}

abstract class Employee implements Help_able {
    abstract void work();
}

class Teacher extends Employee {
    public void work() {
        System.out.println("Teacher works");
    }
    public void help () {
        System.out.println("Techer helps");
    }
}

class Driver extends  Employee {
    public void work() {
        System.out.println("Driver works");
    }
    public void help () {
        System.out.println("Driver helps");
    }
}

interface Help_able {
    void help();
}
