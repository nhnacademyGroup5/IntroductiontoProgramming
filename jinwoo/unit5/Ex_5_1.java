package jinwoo.unit5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_5_1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int input = Integer.valueOf(br.readLine());
        System.out.println(solution(input));
    }

    public static String solution(double i){
        if(i > 40){
            return "extra strong liquor";
        } else if( i<= 40 && i > 20){
            return "strong liquor";
        } else if(i<=20 && i > 15){
            return "liquor";
        } else if(i<=15 && i>12){
            return "strong vine";
        } else if(i<=12 && i > 10.5){
            return "normal vine";
        } else{
            return "light vine";
        }
    }
}
