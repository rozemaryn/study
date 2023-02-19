package Lesson23;

public class Test6 {
}

class AnotherAnimal {
    static String showName () {
        return "Some name";
    }

    void showInfoAboutAnimal () {
        System.out.println("Animal name is " + showName());
    }
}

class Mouse2 extends AnotherAnimal {

    static String showName () {
        return "Jerry";
    }

    void showInfoAboutMouse () {
        System.out.println("Mouse name is " + showName());
    }

    public static void main(String[] args) {
        Mouse2 a = new Mouse2();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}

