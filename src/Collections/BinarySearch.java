package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);

        ArrayList <Employee3> emps = new ArrayList<>();
        Employee3 emp1 = new Employee3(13, "Stanislav", 545);
        Employee3 emp2 = new Employee3(345, "Kostya", 230);
        Employee3 emp3 = new Employee3(13, "Andrey", 620);
        Employee3 emp4 = new Employee3(15, "Mariya", 5678);
        Employee3 emp5 = new Employee3(182, "Kolya", 125);
        Employee3 emp6 = new Employee3(15, "Anton", 800);
        Employee3 emp7 = new Employee3(250, "Elena", 1579);

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);
        emps.add(emp6);
        emps.add(emp7);

        Collections.sort(emps);
        System.out.println(emps);

        int index2 = Collections.binarySearch(emps, new Employee3(182, "Kolya", 12));
        System.out.println(index2);
    }
}

class ArrayBinarySearch {
    public static void main(String[] args) {
        int [] array = {16, -4, 67, 2, -3, 0, 9, 111, 77, -25};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int index3 = Arrays.binarySearch(array, 77);
        System.out.println(index3);
    }
}

class Employee3 implements Comparable <Employee3> {
    int id;
    String name;
    double salary;

    public Employee3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee3 another) {
        int result = this.id - another.id;
        if (result == 0) {
            result = this.name.compareTo(another.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}