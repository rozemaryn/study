package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult () {
        int divisible = 21;

        class Division {

            private int divisor;

            public int getDivisor() {
                return divisor;
            }

            public void setDivisor(int divisor) {
                this.divisor = divisor;
            }

//            public int getDivisible() {
//                return divisible;
//            }
//
//            public void setDivisible(int divisor) {
//                this.divisible = divisible;
//            }

            public int getQuotient () {
             return divisible/divisor;
            }

            public int getRemainder () {
                return divisible%divisor;
            }
        }

        Division division = new Division();
        // division.setDivisible(21);
        division.setDivisor(4);
        System.out.println("Делимое = " + divisible);
        System.out.println("Делитель = " + division.getDivisor());
        System.out.println("Частное = " + division.getQuotient());
        System.out.println("Остаток = " + division.getRemainder());
    }
}
