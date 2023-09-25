package ch5;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String read = sc.nextLine();
        String[] str = read.split(" ");

        // regular expression을 사용하여 각 조건에 대해 ^ & 로 치환
        read = read.replaceAll("[aiu]", "^");
        read = read.replaceAll("[eo]", "&");

        System.out.println(read);
        if(str.length == 1) System.out.println("MAYBE");
        else if(read.indexOf("^") >= 0) System.out.println("YES");
        else if(read.indexOf("&") >= 0) System.out.println("NO");
        else System.out.println("DON'T KNOW");
        
        sc.close();
    }   

}
