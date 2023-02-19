package Lesson6;

public class Overload2 {

    public int sum (int i1, int i2) {
        return i1 + i2;
    }

    protected void sum (int i1, String i2) {
        System.out.println("A nifiga");
    }

    protected String sum (String s1, String s2) {
        return s1 + s2;
    }
}

class Overload2Test {
    public static void main(String[] args) {
        Overload2 Ov = new Overload2();

        int a = Ov.sum(57, 69);
        System.out.println(a);

        String b = Ov.sum("Piu-", "piu");
        System.out.println(b);

    }
}
