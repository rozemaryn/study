package Practice.Sololearn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Find which math expression matches the answer that you are given,
if you have an integer answer and a list of math expressions
 */

public class Mathematics {
public static String findExpression(int a, String s) {
    ArrayList <String> expressions = new ArrayList<>();

    Pattern pattern = Pattern.compile("\\d+|[-+*/]");
    Matcher matcher = pattern.matcher(s);

    while (matcher.find()) {
        expressions.add(matcher.group());
    }

    int firstNumber;
    int secondNumber;
    String mathExpression;
    int result = 0;

    for (int i = 0; i < expressions.size(); i+=3) {

        firstNumber = Integer.parseInt(expressions.get(i));
        secondNumber = Integer.parseInt(expressions.get(i+2));
        mathExpression = expressions.get(i+1);

        switch (mathExpression) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber/secondNumber;
                break;
            case "*":
                result = firstNumber*secondNumber;
                break;
        }

        if (result == a) {
            return "index " + (i - 2);
        }
    }
return "none";
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = sc.nextInt();
        String expressions = sc2.nextLine();

        String s = findExpression(a, expressions);
        System.out.println(s);
    }
}
