package ch5;

import java.util.Scanner;

import ch6.staticMethod;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
    }
    
    // 5.2
    public static String condition(int[] arr){
        int count = 0;
        String str;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]) count++;
            }
        }

        if(count == 0) {
            // System.out.println("irregular");
            str = "irregular";
        } else if(count == 1) {
            // System.out.println("symmetric");
            str = "symmetric";
        } else {
            // System.out.println("regular");
            str = "regular";
        }

        
        return str;
    }

    public static void complexCondition(int[] arr){
        if(arr[0] != arr[1] && arr[1] != arr[2] || arr[0] != arr[1]) System.out.println("irregular");
        else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == arr[2]) System.out.println("regular");
        else System.out.println("symmetric");
    }
}
