package Collections;

import java.util.Stack;

public class StackExample {

    static void abc1 () {
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }

    static void abc2 () {
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3 () {
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        abc3();
        System.out.println("Main ends");

    }
}

class StackExmp2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Sasha");
        stack.push("Dasha");
        stack.push("Natasha");
        stack.push("Glasha");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println(stack);
    }
}
