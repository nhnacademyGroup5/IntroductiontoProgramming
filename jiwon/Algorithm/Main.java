package Algorithm;

import static java.math.BigInteger.valueOf;

import java.math.BigDecimal;

public class Main {

    public static class Fraction {
        private int numerator;  // 분자
        private int denominator;    // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }


        public void normalize() {

            int gcd = valueOf(this.numerator).gcd(valueOf(this.denominator)).intValue();
            this.numerator /= gcd;
            this.denominator /= gcd;
        }

        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    public static int getDecimalNumber(BigDecimal num) {
        String str = num.toPlainString();
        int digitsDec = str.length() - 1 - str.indexOf('.');
        return digitsDec;
    }

    public static Fraction solution(String input) {
        BigDecimal number = new BigDecimal(input);

        int decimalNumber = getDecimalNumber(number);

        int denominator = 1;
        int numerator = 0;


        for (int i = 0; i < decimalNumber; i++) {
            denominator *= 10;

        }

        // ex) 1.24 1.24 * 100 > 124
        numerator = number.multiply(BigDecimal.valueOf(denominator)).intValue();
        return new Fraction(numerator, denominator);
    }

    public static void main(String[] args) {
        String input = "-11.25";
        Fraction result = solution(input);
        System.out.println("Fraction representation: " + result);
    }

}