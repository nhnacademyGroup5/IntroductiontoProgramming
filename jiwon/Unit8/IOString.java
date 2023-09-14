package Unit8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOString {
    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            a[i] = line;
        }
        return a;


    }

    public static void saveArray(OutputStream os, String[] sa) throws IOException {
        PrintWriter ps = new PrintWriter(os);
        BufferedWriter bw = new BufferedWriter(ps);
        for (String s : sa) {
            if (s != null) {
                bw.write(s);
            }
            bw.newLine();
        }
        bw.flush();
    }
}
