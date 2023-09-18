package ch09;

public class Exercise2 {


    // rumtime error
    // 1. 만약 전역변수를 이용하려고 했다면 this를 사용하여 진행
    // 2. 또는 g() method가 파리미터 값을 받아서 출력하여 진행

    private void f(int x){
        x++;
        g(x);
    }

    private void g(int x){

        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        int x = 200;
        e.f(x);
    }
}
