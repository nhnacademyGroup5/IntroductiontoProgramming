package jinwoo.unit5;

import java.util.Scanner;

public class Ex_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        quadraticEquation(a, b, c);
    }

    private static void quadraticEquation(double a, double b, double c){
        if(a < 0) throw new IllegalArgumentException("Invalid input");
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double Arrangediscriminant = Math.round(discriminant * 100) / 100;
        if(discriminant > 0){
            System.out.println("x1, x2 are real ground.");
            System.out.println("x1 : " + (-b + Arrangediscriminant) / (2 * a));
            System.out.println("x2 : " + (-b - Arrangediscriminant) / (2 * a));
        } else if(discriminant == 0){
            System.out.println("x1 is middle ground.");
            System.out.println("x1 : " + (-b / (2 * a)));
        } else{
            Arrangediscriminant = Math.round(-discriminant * 100) / 100;
            System.out.println("x1, x2 are false ground.");
            System.out.println("x1 : " + (-b / (2 * a)) + " + " + (Arrangediscriminant / (2 * a)) + "i");
            System.out.println("x2 : " + (-b / (2 * a)) + " - " + (Arrangediscriminant / (2 * a)) + "i");
        }
    }   
}
