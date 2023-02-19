package Lesson17;

class Car{}

public class Lesson17 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = sb2;

        System.out.println(sb3.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("d", 4));
        System.out.println(sb2.subSequence(5, 8));

        /* sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append(new Car());
        System.out.println(sb2); */

        System.out.println(sb2.insert(4, " good"));
        System.out.println(sb2.insert(sb2.length(), "!!"));

        sb2.delete(14, sb2.length());

        System.out.println(sb2);

        StringBuilder sb5 = new StringBuilder("Дурачкиии");
        sb5.deleteCharAt(sb5.length()-1);
        System.out.println(sb5);
        sb5.reverse();
        System.out.println(sb5);
        sb5.reverse();

        sb5.replace(0, sb5.length(), "Гонять дурачков");
        System.out.println(sb5);
        System.out.println(sb5.length());
        System.out.println(sb5.indexOf("в"));

        System.out.println(sb5.capacity());

        StringBuilder sb11 = new StringBuilder("Kotya");
        System.out.println(sb11.capacity());
    }
}

class Test {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello, friend!");
        String s = null;
        s = s1.append(" How are you?").substring(s1.indexOf("f"), s1.indexOf("!"));
        System.out.println(s);
    }
}

class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println(sb1);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        StringBuilder sb5= sb3;

        System.out.println(sb3.equals(sb4));
        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb5));

        StringBuffer sb6 = new StringBuffer("Goodbye");
        String s1 = new String(sb6);
        System.out.println(s1);

    }
}
