package ch5;

import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double g = sc.nextDouble();

        if(g > 40) System.out.println("extra strong liquor");
        else if(g > 20 && g <= 40) System.out.println("strong liquor");
        else if(g > 15 && g <= 20) System.out.println("liquor");
        else if(g > 12 && g <= 15) System.out.println("strong vine");
        else if(g > 10.5 && g <= 12) System.out.println("normal vine");
        else System.out.println("light vine");    

        sc.close();
    }
    
}