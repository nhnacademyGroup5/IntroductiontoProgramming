package ch6;

public class staticMethod {
    

    // 2
    public static void evenNumber(int input){
        while(true){
            if(input % 2 == 0) {
                System.out.println("even Number : "+ input);
                break;
            }
            input--;
        }
    }

    // 3
    public static int factorial(int x){
        if(x == 1) return 1;

        return x * factorial(x-1);
    }
    
    // 5
    public static double pi(int x){
        double Pi = 0;

        double denominator = 1;

        for(int i=0; i<x; i++){
            if(i % 2 == 0) Pi += 1/denominator;
            else Pi -= 1/denominator;

            denominator += 2;
        }
        return 4 * Pi;
    }

    // 6
    public static String decode(String str, int n){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = (char) (str.charAt(i) - n);
            sb.append(ch);
        }

        return sb.toString();
    }

    // 7
    public static int chisEmtpy(String str, char ch){
        int idx = -1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    // 9
    public static void pyramid(int h){
        int lim = h * 2 - 1;
        int space = lim / 2;
        int cnt = 1;

        for(int i=0; i<h; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=cnt/2+1; j++){
                System.out.print(j);
            }
            for(int j=cnt/2; j>0; j--){
                System.out.print(j);
            }System.out.println();
            space--;
            cnt += 2;
        }
    }

    public static boolean isprime(int x){
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }
}
