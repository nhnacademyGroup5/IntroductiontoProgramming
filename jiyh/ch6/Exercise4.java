package ch6;

import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        String sequence = sc.next();
        System.out.println(sequence);
        
        for(int i=0; i<sequence.length();){
            if(sequence.charAt(i) == '-'){
                sum -= sequence.charAt(++i) - '0';
            }else{
                sum += sequence.charAt(i) - '0';
            }
            i++;
        }sc.close();

        System.out.println(sum);
    }

}
