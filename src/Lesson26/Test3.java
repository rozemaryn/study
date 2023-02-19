package Lesson26;

public class Test3  {
//    void abc (int i) {
//        System.out.println("int");
//    }
    void abc (long l) {
        System.out.println("long");
    }
    void abc (byte b) {
        System.out.println("byte");
    }

    void def (Object obj) {
        System.out.println("Object");
    }

    void def (String s) {
        System.out.println("String");
    }



    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc((byte)5);
        t.def("котька");
    }
}
