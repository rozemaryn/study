package lesson_5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double SalaryRaise(){
        salary *= 2;
        return salary;
    }

    void ShowInfo(){
        System.out.println(id + " " + surname + " " + age + " " + salary + " " + department);

    }
}


class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Petrov-Vodkin", 35, 13000.0, "Marketing");
        Employee emp2 = new Employee(2, "Ivanchenko", 22, 5500, "HR");

        emp1.SalaryRaise();
        emp1.ShowInfo();

        emp2.SalaryRaise();
        emp2.ShowInfo();
    }
}