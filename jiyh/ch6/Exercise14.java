package ch6;

import java.util.Scanner;

public class Exercise14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idx = 2;
        while(n > 1){
            if(!staticMethod.isprime(idx)) {idx++; continue;}

            if(n % idx == 0) {
                System.out.print(idx + " ");
                n /= idx;
            }else{
                idx++;
            }

        }

    }
}
