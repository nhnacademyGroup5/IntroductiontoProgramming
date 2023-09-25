package HomeWork;

import java.util.Scanner;

public class CombinationsAndGCD {
    public static int[][] combination(int[] numbers) {
        int n = numbers.length;
        int totalCombinations = n * (n - 1) / 2;
        int[][] result = new int[totalCombinations][2];

        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                result[index][0] = numbers[i];
                result[index][1] = numbers[j];
                index++;
            }
        }

        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] <= 0) {
                System.out.println("Error");
                scanner.close();
                return;
            }
        }

        int result = gcd(numbers[0], numbers[1]);
        for (int i = 2; i < n; i++) {
            result = gcd(result, numbers[i]);
        }

        System.out.println("The GCD of the elements is: " + result);

        int[][] combinations = combination(numbers);
        System.out.println("Combinations:");
        for (int[] combination : combinations) {

            System.out.println("{" + combination[0] + ", " + combination[1] + "}");

        }

        scanner.close();
    }
}
