package ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class IostreamTest {
    public static void main(String[] args) throws IOException {
        // 1, 2
        String[] loadString = Iostream.loadStrings(System.in, 4);
        Iostream.saveString(System.out, loadString);
    
        String str = "123";
        str.charAt(0); // return type char
        str.codePointAt(0); // return type int

        
        // 3
        Iostream.checkFirstChar(new FileInputStream("test1.txt"));
        // 4
        Iostream.createTableFile("mulTable.txt", 3);
        // 5
        System.out.println(Iostream.maxAvgscore("score.txt"));

        
        
    }
}
