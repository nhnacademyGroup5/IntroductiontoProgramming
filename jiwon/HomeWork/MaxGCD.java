package HomeWork;

public class MaxGCD {
    public static int maxGCD(int[] numbers) {
        int max = 0;
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentGCD = CombinationsAndGCD.gcd(numbers[i], numbers[j]);
                max = Math.max(max, currentGCD);
            }
        }

        return max;
    }

}
