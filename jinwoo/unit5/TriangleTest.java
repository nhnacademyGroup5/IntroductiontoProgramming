package jinwoo.unit5;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle.typeOfTriangle());
    }
}
