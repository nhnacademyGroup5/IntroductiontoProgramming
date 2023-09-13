import java.util.Arrays;

public class Main {

    private static final int[][] TEST_CASE =  {
            {1,1},
            {98,49},
            {2,81},
            {3,7},
            {19,87},
            {1,20}

    };

    private static final int[] TEST_CASE_RESULT = {
            1,
            98,
            162,
            21,
            1653,
            20
    };

    private static double correct = 0;

    private static boolean test(int first, int second , int result){

        if(solution(first,second) == result){
            correct++;
            return true;
        }

        return false;


    }




    public static void main(String[] args) {
        for(int i=0; i< TEST_CASE.length; i++){

            System.out.print("{ "+TEST_CASE[i][0] + " , " + TEST_CASE[i][1] +" }"+ " = ")
            ;


            System.out.println(test(TEST_CASE[i][0],TEST_CASE[i][1],TEST_CASE_RESULT[i]));
        }
            System.out.printf("정답률 = %d%n",(int)(correct / TEST_CASE.length *100));


    }

    private static int solution(int first, int second) {
        int min = Math.min(first, second);

        while (true) {
            if (min % first == 0 && min % second == 0) {
                return min;
            } else {
                min++;
            }
        }

    }



}