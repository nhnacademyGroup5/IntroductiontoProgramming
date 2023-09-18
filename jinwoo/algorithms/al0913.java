package jinwoo.algorithms;

public class al0913 {
    private static final int[][] TEST_CASE = {{1,1}, {98,49}, {2, 81}, {3,7}, {19,87}, {1,40}};
    private static final int[] TEST_RESULT = {1,98,162,21,1653,40};
    public static void main(String[] args) {
        test();
    }

    private static void test(){
        for (int i = 0; i < TEST_CASE.length; i++) {
            if(solution(TEST_CASE[i][0], TEST_CASE[i][1]) == TEST_RESULT[i]){
                System.out.println("Test " + i + ": is passed.");
            } else{
                System.out.println("Test " + i + ": is failed.");
            }
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
    
    private static int solution(int x, int y) {
        return x * y / gcd(x,y);
    }
}