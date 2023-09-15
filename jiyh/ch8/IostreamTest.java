package ch8;

import java.io.FileInputStream;
import java.io.IOException;


public class IostreamTest {
    public static void main(String[] args) throws IOException {
        
        // 1, 2
        String[] loadString = Iostream.loadStrings(System.in, 4);
        Iostream.saveString(System.out, loadString);

        // 3
        Iostream.checkFirstChar(new FileInputStream("test1.txt"));
        // 4
        Iostream.createTableFile("mulTable.txt", 3);
        // 5
        System.out.println(Iostream.maxAvgscore("score.txt"));

        
        
    }
}
