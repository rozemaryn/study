package job4j;

import Lesson10.p4.D;

public class Exercises {
}

/*
2. Объявить класс и переменную
Дан неполный каркас класса Task2.

Задание: Объявить класс Task2, объявить в нём переменную x типа int со значением 5.
 */

class Task2 {
    int x = 5;
}

/*
Выведите на консоль числа от N до M. M не входит. В этом упражнении используйте цикл for c index.

 в условии предполагается, что M > N. Но что, если это не так? Писала код с учётом этого случая
 */

class PrintNM {
    public static void prinntNM (int n, int m) {
        if (n < m) {
            for (int i = n; i < m; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = m; i < n; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        prinntNM(0, -5);
    }
}

/*
5. Вывести стоимость конфет за килограмм
 Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */

class Sweets {
    public static void priceForPound (int price) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i*price);
        }
    }

    public static void main(String[] args) {
        priceForPound(20);
    }
}

/* 6. Произведение чисел в диапазоне
Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
 */

class MultAB {
    public static void multFromAToB (int a, int b) {
        long result = 1L; // на случай, если результат не входит в диапазон int
    for (int i = a; i <= b; i++) {
        result *=i;
    }
        System.out.println(result);
    }

    public static void main(String[] args) {
        multFromAToB(2, 6);
        multFromAToB(64, 75);
    }
}
/*
7. Найти степень числа
Дано целое число a и целое число n (> 0). Найти a в степени n: a^n = a·a· . . . ·a (числа a перемножаются n раз).
 */
class DegreeLoop {
    public static long calculate(int a, int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *=a;
        }
        return result;
    }

    public static void main(String[] args) {
        long degree = calculate(3, 15);
        System.out.println(degree);
    }
}

/*
8. Вывести делители числа
Дано целое число n (> 0). Нужно вывести делители числа. Делитель это число на которое делится заданное число
 */

class Multipliers {
    public static void out (int a) {
        for (int i = 1; i <=a; i++)
            if(a%i == 0) {
                System.out.println(i);
            }
    }

    public static void main(String[] args) {
        out(24);
    }
}

/*
9. Найти количество нечетных в диапазоне
Даны два целых положительных числа a и b (b > a). Найти количество нечетных чисел в диапазоне [a, b].
 */