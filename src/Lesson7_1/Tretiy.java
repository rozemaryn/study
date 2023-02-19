package Lesson7_1;

public class Tretiy {
    public static void main(String[] args) {
        Lesson7.Employee emp = new Lesson7.Employee(27000); // можно просто скопипастить с короткими именами,
        // идея сама импортирует всё, что надо
        System.out.println(emp.salary);
        emp.ZP2x();
    }
}
