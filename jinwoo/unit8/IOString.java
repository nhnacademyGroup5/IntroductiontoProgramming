package jinwoo.unit8;

import java.io.*;
import java.util.StringTokenizer;

public class IOString {

    // Ex 8.1.
    private static String[] loadArray(InputStream is, int n) throws IOException{
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        if(st.countTokens() < n) throw new IllegalArgumentException("입력 값이 부족합니다!");
        String[] result = new String[n];
        int count = 0;
        while(count != n){
            result[count] = st.nextToken();
            count++;
        }

        return result;
    }
    private static void printArray(OutputStream os, String[] sa){
        PrintStream ps = new PrintStream(os);
        for (String string : sa) {
            ps.println(string);
        }
    }

    // Ex 8.2.
    private static double inputAvarage(InputStream is) throws IOException{
        double sum = 0.0;
        int count = 0;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int input;
        while(input != 0){
            input = br.read();
            sum += input;
            count++;
        }
        return sum / count;
    }

    public static void main(String[] args) throws IOException{
        InputStream is = System.in;
        OutputStream os = System.out;
        // printArray(os, loadArray(is, 4));
        
    }
}
