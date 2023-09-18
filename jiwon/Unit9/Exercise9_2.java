package Unit9;

public class Exercise9_2 {
    

    private void f(int x) {
        x++;
        g(x);
    }

    private void g(int x) {
        System.out.println(x); //- 원래 대로면 private int x 를 출력한다
    }

    public static void main(String[] args) {
        Exercise9_2 e = new Exercise9_2();
        int x = 200;
        e.f(x);
    }
}
