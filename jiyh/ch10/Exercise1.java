public class Exercise1 {
    
    public static void main(String[] args) {

        for(int i=1; i<40; i++){
            System.out.println(iterativeFino(i));
        }
    }

    static int iterativeFino(int idx){
        if(idx < 3) return idx;

        int[] fibo = new int[idx+1];
        
        fibo[1] = 1;
        fibo[2] = 2;
        for(int i=3; i<= idx; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[idx];
    }
}
