package jinwoo.assignment.maxGCD;

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
            int[][] result = MaxGCD.combination(arr);
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i][0] + " " + result[i][1]);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
