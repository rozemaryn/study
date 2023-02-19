package Lesson11;

public class Worker {
    public String name;
    public double salary;

    Worker (String name, double salary) {
        this.name = name;
        this.salary = salary;
        }

    public double multiply2 (double a) {
        a *= 2;
        return a;
    }

    public double raisesalary() {
        salary *=2 ;
        return salary;
    }


}

class WorkerTest {
    public static void main(String[] args) {
        Worker w1 = new Worker("Nikita", 242.2);
        double d = w1.multiply2(w1.salary);
        System.out.println(d); // здесь значение удвоится, 484.4
        System.out.println(w1.salary);/* здесь останется таким же, 242.2, потому что с зарплатой метод ничего не делает
        он только берёт её значение */
        /* w1.salary = w1.multiply2(w1.salary); а вот так мы увеличиваем собственно зарплату, это я сама придумала,
        хз, насколько верно
        */

        w1.raisesalary();
        System.out.println(w1.salary);
    }
}