package Lesson7;

public class EmployeeHomework {

    int id;
    public String surname;
    private double salary;

    public void ShowId() {
        System.out.println(id);
    }

    public void ShowSurname() {
        System.out.println(surname);
    }

    public void ShowSalary() {
        System.out.println(salary);
    }

    public EmployeeHomework (int id2, String surname2, double salary2) {
        id = id2;
        surname = surname2;
        salary = salary2;
    }

    EmployeeHomework (int id2, String surname2) {
        id = id2;
        surname = surname2;
    }

    private EmployeeHomework (int id2, double salary2, String surname2) {
        id = id2;
        salary = salary2;
        surname = surname2;
    }

    EmployeeHomework Emp4 = new EmployeeHomework(4,"Petrov", 12);


}

class HomeworkTest {
    public static void main(String[] args) {
        EmployeeHomework Emp1 = new EmployeeHomework(1, "Dokinz", 666);

        Emp1.ShowId();
        Emp1.ShowSalary(); // хотя переменная private, она отображается, пч метод publuc
        Emp1.ShowSurname();

        // System.out.println(Emp1.salary); // а вот так уже не покажется

        EmployeeHomework Emp2 = new EmployeeHomework(2, "Jaks");
    }


}
