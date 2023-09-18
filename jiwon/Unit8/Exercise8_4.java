package Unit8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise8_4 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("test.txt"); //Stringbuilder ->로 수정
        PrintWriter out = new PrintWriter(f);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int product = i * j;
                out.print(product);


                out.print(" ");
                //if 구문 삭제
            }

            out.println();
        }

// stringbuilder ->
        out.flush();
        out.close();
    }
}
