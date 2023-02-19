package Lesson9;

public class Pupil {

    int a =10;
    int b =this.a;
    public static int c = 5;
    public int z = this.c;
    static int f = c;
}

class PupilTest {
    public static void main(String[] args) {
        Pupil p1 = new Pupil();
        Pupil p2= new Pupil();
        Pupil p3; // здесь просто создалась ссылка, но она пустая, не ведёт ни на какой объект

        p1 = null; // здесь удалилась ссылка на объект, а сам он остался, просто мы не можем к нему обратиться

        p2 = new Pupil();
    }
}
