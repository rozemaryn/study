package Lesson13;

public class Month {
    public static int MonthNumber = 11;

    public static void main(String[] args) {
        switch (MonthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days is thirty one");
                break;
            case 2:
                System.out.println("Number of days is twenty eight");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days is thirty");
                break;
            default:
                System.out.println("The entered data is incorrect");
        }
    }
}
