package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3  {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\Java\\study2\\src\\Lesson27\\test10.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FileOutputStream fos = new FileOutputStream(f);
        fos.write(5);

    }
}

class Y {
    void abc () throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }
}
