package Lesson21;

public class Lesson21 {
    public static void main(String[] args) {
//        int a = 4;
//        System.out.println(a<4?7:"privet");

        int b = 5;
        int c = 5;
        int d = b>6 ? b++ : ++c;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Test1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hello");
        s2 = new String("goodbye");
        s1 = s2;
        String s3 = s1;
        s1 = null;
        System.out.println(s2);
    }
}

class Test2 {
    public static void abc (String s) {
        System.out.println(s);
    }

    private static StringBuilder abc (StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder();
    }

    public static void main(String[] args) {
        abc(new StringBuilder("test"));
    }
}

class Test3 {
    int abc () {
        return 5;
    }

    int abc2 (int i) {
        if (i>10) {return 5;}
        else {return 10;}
    }



    public static void main(String[] args) {
        int a = new Test3().abc();
        System.out.println(a);

        new Test3().abc();
    }
}

class Test4 {

    int a = 5;
    int h, k = 3, j;
    int l;
    // l = 6;

    public void abc (int i, int d) {
        int l;
        l = 6;
        System.out.println("Friday");
    }

    public void abc (double d, int i) {
        System.out.println("Mood");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
         t.abc(1, 2);
    }
}

class Test5 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(a>2? a<5? 3 : 6 : 9);
    }
}

class Employee {
    Employee manager = new Employee();
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e = null;
        e = new Employee();
        e = null;
    }
}
