package Lesson7;

public class Employee {

    public double salary;

    public void ZP2x() {
        double result = salary*2;
        System.out.println("Novaya zarplata = " + result);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(27000);
        System.out.println(emp.salary);
        emp.ZP2x();

        Employee [] array1 = {emp, new Employee(10000), new Employee(13000)};
        System.out.println(array1[1]);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(27000);
        System.out.println(emp.salary);
        emp.ZP2x();
    }
}
