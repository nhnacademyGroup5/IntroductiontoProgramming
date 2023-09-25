package jinwoo.assignment.max_gcd;

import java.math.BigInteger;
import java.util.Arrays;

public class GCD extends MathOperation implements BinaryOperation<Integer>{

    @Override
    public Integer calculate(Integer x, Integer y){
        try {
            if(x <= 0 || y <= 0) throw new IllegalArgumentException("GCD.calculate : Must be positive integer.");
            BigInteger bigIntX = BigInteger.valueOf(x);
            BigInteger bigIntY = BigInteger.valueOf(y);
            return bigIntX.gcd(bigIntY).intValue();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static int maxGCD(int... numbers){
        try {
            if(numbers.length < 2) throw new IllegalArgumentException("GCD.maxGCD : Required at least two values.");
            int length = numbers.length * (numbers.length -1) / 2;
            int[][] doubleArr = combination(numbers);
            int[] arr = new int[length];
            Max max = new Max();
            GCD gcd = new GCD();
            for (int i = 0; i < length; i++) {
                arr[i] = gcd.calculate(doubleArr[i][0], doubleArr[i][1]);
            }

            return max.calculate(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
