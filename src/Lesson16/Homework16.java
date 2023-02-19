package Lesson16;

public class Homework16 {

    public static void email(String s1) {
        boolean b1 = s1.endsWith("yahoo.com;");
        boolean b2 = s1.endsWith("mail.ru;");
        boolean b3 = s1.endsWith("gmail.com;");
        if (b1 == true) {
            System.out.println("yahoo");
        } else if (b2 == true) {
            System.out.println("mail.ru");
        } else if (b3 == true) {
            System.out.println("gmail");
        } else {
            System.out.println("Incorrect input");
        }
    }

    public static void main(String[] args) {
        email("animalitos@mail.ru;");
        email("kotka@gmail.com;");
        email("kokokot'ka@yahoo.com;");
        email("animalitos@gmail.com");
    }
}

class Homework {
    public static void email(String s1) {
        String[] split = s1.split(";");
        String result ="";

        for (String mail : split) {
            boolean b1 = mail.contains("yahoo.com");
            boolean b2 = mail.contains("mail.ru");
            boolean b3 = mail.contains("gmail.com");
            String mail1 = "";

            if (b1) {
                mail1 = "yahoo";
            }
            if (b2) {
                mail1 = "mail";
            }
            if (b3) {
                mail1 = "gmail";
            }
            result = result + mail1 + " ";
        }

        result = result.trim();
        System.out.println(result);
    }

    public static void main(String[] args) {
        email("wfa@yahoo.com; gsr@gmail.com; wfwaf@mail.ru");
    }
}


class SolutionD {
    public static void main(String[] args) {
        String s = " wfa@ya.ru; gsr@gmail.com; wfwaf@mail.ru";
        String[] split = s.split(";");
        String result = "";

        for (String mail : split) {
            String mail1 = mail.replaceAll("[a-zA-Z0-9]+@", "");
            String mail2 = mail1.replaceAll(".(ru|com)", "");
            result = result + mail2 + ",";
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }
}
