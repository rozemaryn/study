package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Test9 {
    static int abc () {
        try {
            File f = new File("D:\\Java\\study2\\src\\Lesson27\\test10.txt");
            FileInputStream fis = new FileInputStream(f);
            //return 3;
        }
        catch (FileNotFoundException e) {
            System.out.println("Catched");
            return 5;
        }
        finally {
            System.out.println("Finally");
            // return 6;
        }
        return 6; // так можно написать, если в finally return нет
        // System.out.println("smth"); — нельзя писать в методе после finally
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}

