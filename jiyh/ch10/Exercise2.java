public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(recursiveFibo(5));
    }

    static int recursiveFibo(int idx){
        if(idx <= 2) return idx;

        return recursiveFibo(idx-1) + recursiveFibo(idx-2);
    }
}
