package Lesson25;

public class Test6 {
    byte a = 10;
    int b = a;

    byte b2 = 12; // примеры narrowing without casting
    short s = 4;
    char c1 = 100;

    static int i = 3;
    static byte b3 =((byte)i);

    public static void main(String[] args) {
        System.out.println(b3);

        int i2 = 111111;
        short s2 = (short) i2;
        System.out.println(s2);

        int i3 = (int)3.65;
        System.out.println(i3);

        int i4 = 2147483647;
        int i5 = i4 + 1;
        System.out.println(i5);
    }
}
