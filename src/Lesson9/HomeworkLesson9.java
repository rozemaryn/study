package Lesson9;

public class HomeworkLesson9 {
}

class Game {
    String name;
    int year;
    String genre;

    Game (String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }
}

class GameTest {
    public static void main(String[] args) {
        Game g1 = new Game("Quake", 1996, "Shooter");
        Game g2 = new Game ("Morrowind", 2002, "RPG");
        Game g3 = new Game("Witcher", 2007, "RPG");
        Game g4 = new Game("Elden ring", 2022, "RPG");
        g1 = new Game("Gothic", 2001, "RPG");
        Game g5 = new Game("Super Mario Bros", 1985,"Platform");
        g5 = new Game("Skyrim", 2011, "RPG");

        System.out.println(g1.name);
        System.out.println(g5.name);

        g2 = null;
        g3 = null;
        g4 = null;

        System.out.println(g2.name);
    }
}
