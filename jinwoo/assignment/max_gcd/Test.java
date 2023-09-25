package jinwoo.assignment.max_gcd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[st.countTokens()];
            int index = 0;
            while(st.hasMoreTokens()){
                arr[index] = Integer.parseInt(st.nextToken());
                index++;
            }
            System.out.println(GCD.maxGCD(arr));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
