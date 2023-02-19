package Lesson23;

public class Text7 {
    public static void main(String[] args) {
    E g1 = new G();
    g1.abc(new F());
    }
}

class E {
    void abc (E e) {
        System.out.println("E");
    }
}

class F extends E {

//    void abc (E e2) {
//        System.out.println("BBB");
//    }
// если бы мы вот так написали, то вывелось бы BBB, пч метод перезаписан

    void abc (F f1) {
        System.out.println("F");
    }
}

class G extends F {
    void abc (F f2) {
        System.out.println("G");
    }
}



