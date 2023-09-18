package Unit9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise9_6 {
    public static void main(String[] args) throws IOException, ExceptionLineTooLong {
        String fileName = "jiwon.txt";
        int maxLength = 80;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileReader fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String line;
            int i = 1;

            while ((line = br.readLine()) != null) {
                if (line.length() > maxLength) {
                    throw new ExceptionLineTooLong(i);
                }
                i++;
            }

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }


    }
}
