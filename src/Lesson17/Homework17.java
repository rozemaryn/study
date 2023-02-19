package Lesson17;

public class Homework17 {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        boolean result;
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        if (s1.equals(s2)) {
            result = true;
        }
        else {result = false;}
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("metal");
        StringBuilder sb2 = sb1;
        StringBuilder sb3 = new StringBuilder("metal");
        StringBuilder sb4 = new StringBuilder("митол");

        equality(sb3, sb2);
    }
}
