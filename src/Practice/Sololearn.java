package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sololearn {
}

class Program {
    public static void main(String[] args) {
        //your code goes here

        Scanner sc = new Scanner(System.in);
        int Celsius = sc.nextInt();

        if (Celsius >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}

class Exercise2 {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine();

        switch (colour) {
            case "green":
                System.out.println("2");
                break;

            case "red":
                System.out.println("1");
                break;

            case "black":
                System.out.println("3");
        }
    }
}

class Exercise3 {

    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt(8);

        int a = 8;
        int result = 1;

        for (int i = 1; i < a; i++) {

            result = i * result;

        }
        result *= a;

        System.out.println(result);
    }
}


class Exercise4 {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int i = sc.nextInt();

        switch (i) {
            case 0:
                System.out.println(menu[0]);
                break;

            case 1:
                System.out.println(menu[1]);
                break;

            case 2:
                System.out.println(menu[2]);
                break;

            case 3:
                System.out.println(menu[3]);
                break;

            case 4:
                System.out.println(menu[4]);
                break;

            default:
                System.out.println("Invalid");
        }
    }
}


class Exercise5 {

    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        //your code goes here

        int row = sc.nextInt();
        int column = sc2.nextInt();

        if (seats[row][column] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }

    }

}

class T1 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            // arr = i; — тут была ошибка в задании
        }
    }
}

class Exercise6 {

    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again".
    */


    static void bot(int a) {
        if (a == 1) {
            System.out.println("Order confirmed");
        } else if (a == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        bot(a);
    }

}

class Exercise7 {
    static double fahr(double a) {
        return a * 1.8 + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}

class Exercise8 {

    static void profit(int a) {
        if (a * 3_000_000 > 21_000_000) {
            System.out.println("Profit");
        } else if (a * 3_000_000 == 21_000_000) {
            System.out.println("Broke Even");
        } else {
            System.out.println("Loss");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        profit(a);
    }
}

class Exercise9 {
    /*
    сперва разбить предложение на отдельные слова через сплит
    и затем уже работать с каждым словом отдельно
     */

    static void PigLatin(String original) {

        String[] array = original.split(" ");
        String PigLatin = "";
        for (String s1 : array) {
            char first = s1.charAt(0);

            String s2 = s1.substring(1);
            PigLatin = PigLatin + s2 + first + "ay" + " ";
        }

        System.out.println(PigLatin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        PigLatin(str);

    }
}

class Exercise10 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int [] array = new int[a];


        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            array[i] = b;
            }


        int sum = 0;

        for (int c: array) {
            if (c%2 ==0) {
            sum+= c;}
        }

        System.out.println(sum);
    }
}

    /*
    1) Сперва нужно понять по имени, какой я в очереди и сколько лицензий до меня

    Как это выглядит? создать массив из 4-х имён, добавить к нему наше
    затем отсортировать массив и получить индекс нашего имени

    это и будет, сколько лицензий должны выдать до нас
    например, если мы первые, то индекс 0 и до нас 0 лицензий должны выдать


    2)
    кол-во операторов — это количество лицензий, которые можно выдать за 20 минут

    тогда надо поделить кол-во лицензий, которые должны получили до тебя, на кол-во лицензий на 20 минут

    если число получается целое (т.е. остаток от деления 0), то умножаем на 20 и прибавляем 20
    если дробное — умножаем на 20 и прибавляем 10

    ВРОДЕ рабоботает!!

     */


class DriverLicense {

    static void howLong (String s1, int agents, String s2) {

        int a = 0; // кол-во лицензий до нас

        String [] split = s2.split(" ");

        ArrayList <String> listOfStrings = new ArrayList <String>();
        Collections.addAll(listOfStrings, split);

        listOfStrings.add(s1);
        Collections.sort(listOfStrings);

        a = listOfStrings.indexOf(s1);

        int time = 0; // время на получение вод. прав

        if (a%agents == 0) {
            time = a/agents * 20 + 20;
        }
        else if (a%agents != 0) {
            time = a/agents * 20 + 10;
        }

        System.out.println(time);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String name = sc.nextLine();
        int agents = sc.nextInt();
        String names = sc2.nextLine();

        howLong(name, agents, names);
    }
}




