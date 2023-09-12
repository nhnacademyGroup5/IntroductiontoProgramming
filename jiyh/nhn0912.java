public class nhn0912 {
    public static void main(String[] args) {
        
        System.out.println(gcd(10, 20));
        // System.out.println(soultion(1, 2, 3, 4, 5, 6, 7));
        System.out.println(soultion(10, 20, 30, 40));
    }

    public static int soultion(int... number){
        int max = 0;

        for(int i=0; i<number.length-1; i++){
            for(int j=i+1; j<number.length; j++){
                int x = gcd(number[i], number[j]);
                max = Math.max(x, max);
            }
        }

        return max;
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
