package nested_classes.local_inner_class.anonymous_class;

import java.sql.SQLOutput;

public class anonymous_class {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(m.doOperation(3, 6));

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m2.doOperation(3, 6));
    }
}

class Math {
    int doOperation (int a, int b) {return  a/b;}

}
