package Lesson6;

public class Employee2 {

    Employee2 (int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    public Employee2(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee2 (int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }


    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class Employee2Test {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Perviy", 27);
        System.out.println(emp1.surname);

        Employee2 emp2 = new Employee2("Noven'kiy", 17);
        System.out.println(emp2.age);

        Employee2 emp3 = new Employee2(2, "Dedov", 53, 50000.500, "IT");
        System.out.println(emp3.department);
    }
}
