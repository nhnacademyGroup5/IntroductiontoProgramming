package ch6;

import java.util.Scanner;

public class Exercise12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i=2; i<=x; i++){
            if(staticMethod.isprime(i)) System.out.print(i + " ");
        }
    }
}