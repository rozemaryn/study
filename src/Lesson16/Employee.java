package Lesson16;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee {
    double salary;
    boolean IsManager;

    Employee(double salary, boolean IsManager) {
        this.salary = salary;
        this.IsManager = IsManager;
    }
}

class EmpTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(155.5, true);
        System.out.println("Is he a manager? " + emp1.IsManager + " How much is his salary? " + emp1.salary);

    }
}

class Test5 {
    public static void main(String[] args) {
        String s = null;
        s += "ok";
        System.out.println(s);

        System.out.println(null + "ok");

        String s1 = "DFGEKhfDF";
        String s2 = s1.toLowerCase();
        System.out.println(s2);

        System.out.println(s1.toUpperCase());

        boolean b1 = s1.contains("GEK");
        System.out.println(b1);
    }
}

class Test6 {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "Hoooraaaay!!!";
        String s3 = s1.concat(s2).trim().replace("Hoooraaaay!!!", "Hooray!").substring(6, 10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf("W")));
    }
}

class Test7 {
    public static void main(String[] args) {
        String s1 = "Я жить хочу! Хочу печали Любви и счастию назло; Они мой ум избаловали"
                + "И слишком сгладили чело.";
        String s2 = s1.toUpperCase(); // тот же самый текст, но всё с большой буквы

        char c1;
        char c2;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i); // т.е. с1 будет равен Я, первое букве s1; на след. итерации — т маленькое
            c2 = s2.charAt(i); // т.е. с1 будет равен Я, первое букве s2; на след. итерации — Т большое
            if (c1 != ',' && c1 != '!' && c1 != ';' && c1 != '.' && c1 != ' ' && c1 == c2) {
                System.out.println(); // если с1 = с2 тогда с новой строки пишем с1
                System.out.print(c1);
                continue; /* зачем тут нужен continue? без него 2 заглавных буквы выводится
                если без него, то тогда выходим из цикла штоле?*/
            }
            System.out.print(c1); // если с1 != с2, тогда в цикл не входим, а просто сразу выводим с1
        }
    }
}

class Test8 {
    public static void main(String[] args) {
        String s1 = new String("okay");
        String s2 = new String("okay");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = "privet";
        String s4 = "privet";
        /* System.out.println(s3==s4);
        System.out.println(s3.equals(s4)); */

        System.out.println(s1!=s2);
        System.out.println(s3!=s4);

        String s5 = "Hey, Darling!";
        String s6 = "hey, darling!";
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}

class Test10 {
public static void main(String[]args){
        String s1 = "Hello";
        String s2 = " Hello".trim();
    System.out.println(s1 == s2);

    String s3 = "Privet     mir!";
    System.out.println(s3.trim());
        }
        }