package ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IostreamTest {
    public static void main(String[] args) throws IOException {
        
        // 1, 2
        // String[] loadString = Iostream.loadStrings(System.in, 4);
        // Iostream.saveString(System.out, loadString);

        // 3
        System.out.println(Iostream.readAverage(System.in));

        // FileWriter f = new FileWriter("score.txt");
        // PrintWriter r = new PrintWriter(f);
        // r.print("Rossi 25 24 26 30 24 30\n");
        // r.print("Bianchi 20 24 25\n");
        // r.print("Verdi 30 24 30 27\n");
        // f.close();
        // r.close();

        
        // 3
        Iostream.checkFirstChar(new FileInputStream("test1.txt"));
        // 4
        Iostream.createTableFile("mulTable.txt", 3);
        // 5
        System.out.println(Iostream.maxAvgscore("score.txt"));

        
        
    }
}
