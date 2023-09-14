package Unit8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise8_4 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("test.txt");
        PrintWriter out = new PrintWriter(f);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int product = i * j;
                out.print(product);


                if (j < n) {
                    out.print(" ");
                }
            }

            out.println();
        }

    }
}
