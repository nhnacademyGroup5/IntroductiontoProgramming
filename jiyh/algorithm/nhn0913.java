
public class nhn0913 {

    public static int[][] TEST_CASE = {
            {1, 1},
            {20, 10},
            {7, 3},
            {3, 27},
            {11, 12},
            {}
    };

    public static int[] TEST_RESULT = {
            1,
            20,
            21,
            27,
            132
    };

    public static void main(String[] args) {

        for(int i=0; i<TEST_CASE.length; i++){
            System.out.println("case " + (i+1) +" = "+check(i));
        }
    }

    public static boolean check(int idx){
        if(soultion(TEST_CASE[idx]) == TEST_RESULT[idx]) return true;

        return false;
    }
    public static int soultion(int[] input){

        int x;
        int y;

        if(input[0] > input[1]){
            x = input[0];
            y = input[1];
        }else{
            y = input[0];
            x = input[1];
        }
        int gcd = gcd(x, y);

        return (input[0] * input[1]) / gcd;
    }

    public static int gcd(int x, int y){
        if(y == 0) return x;

        return gcd(y, x%y);
    }
}
