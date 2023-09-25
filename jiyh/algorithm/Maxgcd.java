import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Maxgcd {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 2;
        // for(int i=0; i<arr.length; i++){
        //     combination(arr, new int[k], new boolean[arr.length], k, 0, i);
        // }

        List<int[]> combiList = new ArrayList<>();
        combination(combiList, arr, new int[k], new boolean[arr.length], k, 0, 0);

        int[] result = new int[combiList.size()];
        int maxValue = 0;
        for(int i=0; i<result.length; i++){
            int resultGCD = gcd(combiList.get(i)[0], combiList.get(i)[1]);
            maxValue = max(maxValue, resultGCD);
        }

        System.out.println(maxValue);

    }

    public static void combination(List<int[]> combiList, int[] intArray, int[] result, boolean[] visit, int k, int cnt, int idx){
        // pre-condition
        if(intArray == null)
            throw new NullPointerException();
        if(k == 0 || intArray.length == 0)
            throw new IllegalArgumentException();
        if(intArray.length < k)  
            throw new IllegalArgumentException();

        // base
        // 조건을 만족하면 combiList에 저장
        if(cnt == k) { 
            // 다른 방법 찾아서 고칠것
            combiList.add(new int[] {result[0], result[1]});
            return;
        }

        // backtracking
        for(int i=idx; i<intArray.length; i++){
            if(!visit[i]) {
                visit[i] = true;
                result[cnt] = intArray[i];
                combination(combiList, intArray, result, visit, k, cnt+1, i);
                visit[i] = false;
            }
        }
    }


    public static int max (int x, int y){
        return x > y ? x : y;
    }

    public static int gcd(int x, int y){
        if(x < 0 || y < 0)
            throw new IllegalArgumentException();

        if(x < y) return gcd(y, x);
        
        if(y == 0) return x;
        return gcd(y, x%y);
    }

}
