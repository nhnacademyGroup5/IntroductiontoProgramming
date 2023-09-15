package jinwoo.unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Unit6Test {
    public static void main(String[] args) {

        //Ex 6.1.
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(count != 10){
            int randomNum = (int) Math.round(Math.random() * 100);
            list.add(randomNum);
            count++;
        }
        // Ex.6.2.
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(Collections.min(list));

        System.out.println(sequenceSum(10, 1));
        System.out.println(sequenceSum(10, -1));

        System.out.println(calculationPi(2));
        System.out.println(calculationPi(3));

        System.out.println(decoding("hijkl", 3));

        System.out.println(findChar("abcdecc", 'c'));

        multiplyTable(9);

        System.out.println(primeList(10));

        System.out.println(countPrime(3));

        System.out.println(primeFactorization(220));
    }

    //Ex 6.3.
    public static int even(int n){
        if(n <= 0) throw new IllegalArgumentException("Invalid input");
        int result = n;
        if(result % 2 != 0) result+=1;
        return result;
    }

    // Ex 6.4.
    public static int sequenceSum(int n, int direction){
        int sum = 0;
        int tmp = n;
        if(direction == 1){
            for (int i = 0; i < n; i++) {
                sum += tmp;
                tmp++;
            }
        }
        else if(direction == -1){
            for (int i = 0; i < n; i++) {
                sum += tmp;
                tmp--;
            }
        } else{
            throw new IllegalArgumentException("Invalid Input");
        }
        return sum;
    }

    public static double calculationPi(int n){
        int count = 0;
        double result = 0;
        while(count != n){
            result += Math.pow(-1, count) * 4 / (2 * count +1);
            count++;
        }
        return result;
    }

    public static String decoding(String input, int d){
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ((int) arr[i] - d);
        }
        return new String(arr);
    }

    public static int findChar(String input, char c){
        return input.contains(String.valueOf(c)) ? input.indexOf(String.valueOf(c)) : -1;
    }

    public static void multiplyTable(int index){
        for (int i = 1; i <= index; i++) {
            System.out.println(index + " * " + i + " = " + index*i);
        }
    }

    public static void pyramid(int h){
        for (int i = 1; i <= h; i++) {
            
            // while
        }
    }

    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static boolean isPrime(int n){
        if(n <2) return false;
        for (int i = 2; i*i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static String primeList(int n){
        ArrayList<Boolean> list = new ArrayList<>(n+1);
        list.add(false);
        list.add(false);

        for (int i = 2; i <=n; i++) {
            list.add(i, true);
        }

        for (int i = 2; i*i <= n; i++) {
            if(isPrime(i)){
                for (int j = i*i; j <= n; j+=i) {
                    list.set(j, false);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == true){
                sb.append(i);
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static int countPrime(int n){
        int count = 0;
        int primeNumber = 2;
        while(count != n){
            if(isPrime(primeNumber)){
                count++;
                primeNumber++;
            }
        }
        return primeNumber;
    }

    public static String primeFactorization(int n){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(primeList(n));
        int[] arr = new int[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()){
            arr[count] = Integer.valueOf(st.nextToken());
            count++;
        }
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(n % arr[i] == 0){
                sb.append(arr[i]);
                sb.append(",");
            }
            while(n % arr[i] == 0){
                n /= arr[i];
            }
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }
}
