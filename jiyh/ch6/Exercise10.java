package ch6;

import java.util.Scanner;

public class Exercise10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1; i<=x; i++){
            System.out.println("factorial(" + i +  ") : " + staticMethod.factorial(i));
        }
    }
}
