package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String [] array = {"Barev", "dzes"};
        Object [] array2 = array; // здесь происходит автоматический upcasting
        String [] array3 = (String[])array2; // даункастинг, уже нужно делать самим

        array2[0] = new StringBuilder("try");

    }
}
