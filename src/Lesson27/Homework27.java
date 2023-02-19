package Lesson27;

public class Homework27 {
    public static void main(String[] args) {
        Tiger2 t = new Tiger2();
        t.eat("meat");

        try {
            t.drink("water");
            try {
                t.drink("pivo");
            } catch (NotWaterException w) {
                System.out.println(w.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("It's an inner finally block");
            }
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

class NotMeatException extends RuntimeException {

    NotMeatException(String str) {
        super(str);
    }
}

class NotWaterException extends Exception {

    NotWaterException(String str2) {
        super(str2);
    }
}

class Tiger2 {
    void eat(String s) throws NotMeatException {

        if (!s.equals("meat")) {
            throw new NotMeatException("Tiger doesn't eat " + s);
        } else {
            System.out.println("Tiger eats meat");
        }
    }

    void drink(String s) throws NotWaterException {
        if (!s.equals("water")) {
            throw new NotMeatException("Tiger doesn't drink " + s);
        } else {
            System.out.println("Tiger drinks water");
        }
    }
}
