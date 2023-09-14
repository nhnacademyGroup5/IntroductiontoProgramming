package ch5;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        int idx = str.length-1;
        char ch = str[idx].charAt( str[idx].length()-1);

        if(str.length == 1) System.out.println("MAYBE");
        else if(ch == 'a' || ch == 'i' || ch == 'u') System.out.println("YES");
        else if(ch == 'e' || ch == 'o') System.out.println("NO");
        else System.out.println("DON'T KNOW");
        
        sc.close();
    }   

}
