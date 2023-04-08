package Kata_Test_Task;

import java.util.Scanner;

import static Kata_Test_Task.Main.calc;

public class Main {

    private static int checkNumber(String part) throws Exception {
        int num = Integer.parseInt(part);
        if (num < 1 || num > 10) {
            throw new IllegalArgumentException("Number out of range: " + part);
        }
        return num;
    }
    public static String calc(String input) throws Exception {

        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input format");
        }

        int a = checkNumber(parts[0]);
        int b = checkNumber(parts[2]);
        int result;

        switch (parts[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        return Integer.toString(result);
    }
}

class CalcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
