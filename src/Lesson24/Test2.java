package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figure f = new Square(3);
        System.out.println(f.NumberOfSides);
        f.perimeter();
    }
}

abstract class Figure {

    Figure(int NumberofSides) {
        this.NumberOfSides = NumberofSides;
    }
    int NumberOfSides = 0;

    abstract void perimeter();

    abstract  void square();
}

class Square extends Figure {

    Square (int NumberOfSides) {
        super(NumberOfSides);
        this.NumberOfSides = NumberOfSides;
    }
    int side1 = 10;
    int NumberOfSides = 4;

  public void perimeter () {
      System.out.println("Perimeter is " + 4*side1);
  }

    public void square () {
        System.out.println("Square is " + side1*side1);
    }
}

class Rectangle extends Figure {

    Rectangle (int NumberOfSides) {
        super(NumberOfSides);
        this.NumberOfSides = NumberOfSides;
    }

    int side1 = 8;
    int side2 = 5;
    int NumberOfSides = 4;

    public void perimeter () {
        System.out.println("Perimeter is " + 2*(side1 + side2));
    }

    public void square () {
        System.out.println("Square is " + side1* side2);
    }
}

abstract class Circle extends Figure {
    Circle(int NumberofSides) {
        super(NumberofSides);
    }
}

