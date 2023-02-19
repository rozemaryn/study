package Lesson26;

public class Test6  {
    int a = 3 ;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A {
    static final int b;

    static {
        b = 10;
    }

}

class B {
  static int c; // этой переменной можно не придавать значение обязательно, пч это не константа
  static final int d;
  static final int e = 1;
  static final int f;

  static {
       d = 3;
       // e = 2; — это константа, поэтому нельзя изменять значение
       f = 0;
  }
}

class C {
    String s = "ok"; // 4. создаётся переменная
    {
        System.out.println(s); // 5. отрабатывает 1-й обычный иниц-р
    }
    static int i = 0; // 1. сперва создаётся статическая переменная
    static { // 2. отрабатыывает статический иниц-р
        System.out.println(i);
    }
    { // 6. отрабатывает второй обычный иниц-р
        i = i +1;
        System.out.println(i);
    }
    C(){
        System.out.println("It's a constructor"); // 7. срабатывает конструктор
    }

    public static void main(String[] args) {
        System.out.println("Hello everybody"); // 3. срабатыает main, выводится это
        C c = new C();
    }


}
