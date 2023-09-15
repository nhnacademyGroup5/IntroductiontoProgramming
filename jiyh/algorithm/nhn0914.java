import java.math.BigDecimal;

public class nhn0914 {
    private static final String[] TEST_CASES = {
            "1",
            "100",
            "1.25",
            "0.25",
            "0.75",
            "2.25",
            "-0.25"
    };

    private static final String[] TEST_CASES_RESULT = {
            "1/1",
            "100/1",
            "5/4",
            "1/4",
            "3/4",
            "9/4",
            "-1/4"
    };

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
            int prime = 2;
            while (Math.abs(numerator) >= prime && denominator >= prime){
                if(numerator % prime == 0 && denominator % prime == 0){
                    numerator /= prime;
                    denominator /= prime;
                }else{
                    prime++;
                }
            }
        }

        public String toString(){
            return numerator + "/" + denominator;
        }


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

        if(str.split("\\.").length == 1) return str.length();

        return str.split("\\.")[1].length();
    }

    public static String solution(String input) {
        BigDecimal number = new BigDecimal(input);
        double denominator = Math.pow(10, getDecimalNumber(number));
        int numerator = number.multiply(BigDecimal.valueOf(denominator)).intValue();

        return new Fraction(numerator, (int) denominator).toString();
    }

    public static void main(String[] args) {

        String str  = "12345";

        for(int i=0; i<str.length(); i++){
            System.out.println((char)str.codePointAt(i));
        }
        for(int i=1; i<=TEST_CASES.length; i++){
            System.out.println("Test " + i + " : " + testCheck(i-1));
        }

    }

    public static boolean testCheck(int idx){
        return solution(TEST_CASES[idx]).equals(TEST_CASES_RESULT[idx]);
    }
}
