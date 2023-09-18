package ch6;

import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        for(int i=1; i<10; i++){
            min = Math.min(min, sc.nextInt());
        }

        System.out.println(min);

        sc.close();
    }
}