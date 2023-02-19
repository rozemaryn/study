package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "abcdeaefdef";
        String s2 = s1.substring(6, 9);
        System.out.println(s2);

        String s4 = s1.substring(6, 11);
        System.out.println(s4);

        String s3 = s1.trim();
        System.out.println(s3);

        String s5 = "Greetings";
        String s6 = s5.replace('e', 's');
        System.out.println(s6);
        System.out.println(s5);

        String s7 = s5.replace("Gr", "M");
        System.out.println(s7);

        String s8 = s5.replace("t", "t");
        System.out.println(s5==s8);
    }
}

class Test4 {
    public static void main(String[] args) {
        String s1 = "Hello, ";
        String s2 = "my friend";
        System.out.println(s1.concat(s2));

        int a = 5;
        int b = 6;
        String s3 = "ok";
        System.out.println("" + (a + b) + s3);

        // String s4 = a+8;


    }
}
