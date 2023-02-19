package Lesson7_1;

import Lesson7.EmployeeHomework;

public class Homework {
    public static void main(String[] args) {
        EmployeeHomework Emp3 = new EmployeeHomework(3, "Dex", 33);
        Emp3.ShowSurname();
        Emp3.ShowId();
        Emp3.ShowSalary(); // с помощью метода private переменная вызывается, пч он паблик

        System.out.println(Emp3.surname);
        // System.out.println(Emp3.salary); —  а тут уже переменная не показывается, пч она private
        // System.out.println(Emp3.id); — эта тоже не показывается, пч видна только внутри своего пакета
    }
}
