package Unit8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise8_3 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(f);
        String line;

        char[] prefixes = {'/', ';', '%'};
//codepointat
        while ((line = in.readLine()) != null) {
            for (char pre : prefixes) {
                if (line.startsWith(String.valueOf(pre))) {
                    System.out.println(line);
                    break;
                }
            }
        }

        in.close();
    }
}
