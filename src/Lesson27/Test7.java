package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {

    public static void main(String[] args) {
        try {
            File f = new File("text.txt");
            FileInputStream fis = new FileInputStream(f);
        }

        catch (NullPointerException e) {
            System.out.println("Exception-2 was catched");
        }
        catch (IOException e) {
            System.out.println();
        }
        // catch (FileNotFoundException e) { — нельзя, чтобы сабкласс шёл после родительского Exception
         //   System.out.println("Exception-1 was catched");
        // }

    }
}
