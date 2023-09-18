public class Exercise4 {
    
    public static void main(String[] args) {
        
        System.out.println(gcd(10, 5));
        System.out.println(prime(3, 5));
        System.out.println(prime(10, 4));

        System.out.println(rest(13, 7));
    }

    static int gcd(int x, int y){
        if(y == 0) return x;

        return gcd(y, x%y);
    }

    static boolean prime(int x, int y){
        if(x == 1 || y == 1) return true;

        if(x == y) return false;
        if(x < y) return prime(x, y-x);
        return prime(x-y, y);
    }

    static int rest(int x, int y){
        if(x<0) return rest(x+y, y);
        if(x < y) return x;
        return rest(x-y, y);
    }
}
