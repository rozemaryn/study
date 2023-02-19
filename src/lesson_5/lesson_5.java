package lesson_5;

public class lesson_5 {
    int total_sum(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
}

class test_1{
    public static void main(String[] args) {
        lesson_5 s = new lesson_5();
        int summa_3 = s.total_sum(44, 536, -98);
        System.out.println(summa_3);
        System.out.println(s.total_sum(6584,-46282,56));
    }
}