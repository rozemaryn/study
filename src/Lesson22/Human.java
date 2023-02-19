package Lesson22;

//public class Lesson22 {
//    public static void main(String[] args) {
//        int i = 2;
//        String s = new String [] {"A", "B", "C", "D"}[i];
//
//        System.out.println(s);
//    }
//}

public class Human {
    protected final String sex;

    protected Human (String sex) {
        this.sex = sex;
    }

    protected StringBuilder name;
    public StringBuilder getName () {
        return new StringBuilder(name);
    }

    public void setName (StringBuilder s) {
        name = new StringBuilder(s);
    }

    protected int age;

    public int getAge () {
        return age;
    }
    public void setAge (int i) {
        if (i > 0) {
            age = i;
        }
    }
    protected int weight;

    public int getWeight () {
        return weight;
    }
    public void setWeight (int i) {
        if (i > 0) {
            weight = i;
        }
    }

    protected boolean clever;
    public boolean isClever () {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName(new StringBuilder("Petya"));
        h.setAge(25);
        h.setWeight(65);

        System.out.println(h.getName().append("!!!"));
        System.out.println(h.getAge());
        System.out.println(h.getWeight());
    }
}
