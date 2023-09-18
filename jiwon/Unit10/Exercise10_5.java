package Unit10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise10_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("intSequence.txt"));
        int count = 0;
        System.out.println(sequence(br, count));
        br.close();
    }

    public static int sequence(BufferedReader br, int count) throws IOException {
        String line = br.readLine();

        if (line == null) {
            return count;
        }

        int n = Integer.parseInt(line);
        if (n == 1) {
            count++;
        }
        return sequence(br, count);
    }
}