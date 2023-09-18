package Unit7;

public class Exercise7_8 {
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int a[] = new int[6];
        a = new int[] {1, 2, 3, 4, 6, 5};


        System.out.println(mystery(a)); //odd 출력


    }
}
