package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");

        try {
            File f = new File("D:\\Java\\study2\\src\\Lesson27\\test10.txt");
            System.out.println("File was created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream was created");

            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read()); // здесь читается инфа из файла и добавляется в SB
                System.out.println("Info is read");
                System.out.println(result);
                if (counter == 3) {
                    fis.close(); // когда counter 3, то поток чтения закрывается
                } // но так как while ещё работает, то цикл снова пытается прочитать инфу, а поток уже закрыт
                //  вот здесь появится IOException

            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        }
        catch (IOException e) {
            System.out.println("Exception 2");
        }

        finally {
            System.out.println("It's a finally block ");
        }


    }
}
