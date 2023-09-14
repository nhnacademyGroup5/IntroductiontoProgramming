package jinwoo.algorithms;

import java.math.BigDecimal;

public class al0914 {
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
            int gcd = gcd(denominator, numerator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }

        @Override
        public String toString() {
            return numerator + " / " + denominator;
        }


    }

    public static int gcd(int a, int b){
        int result;
        if(a % b == 0){
            return b;
        } else{
            result = a % b;
        }
        return gcd(b, result);
    }

    /**
     * 소수점 값에 대해 자리 수 계산 하는 메서드.    <br/>
     * ex)  <br/>
     * 0.01 -> 100을 곱하기 위해 2를 return    <br/>
     * 0.1 -> 10을 곱하기 위해 1을 return
     *
     *
     * @param num   소수 값
     * @return      소수점 이하 자리 수 값
     */
    public static int getDecimalNumber(BigDecimal num) {
        String str = num.toPlainString();

        return str.length() - str.indexOf(".") + 1;
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input);

        int decimalNumber = getDecimalNumber(number);

        double denominator = (int) Math.pow(10, decimalNumber);
        int numerator = (int) (number.doubleValue() * Math.pow(10, decimalNumber));
        
        return new Fraction(numerator, (int) denominator).toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("1.234512"));
        System.out.println(new BigDecimal("-0.25").indexOf("."));
        
    }

}
