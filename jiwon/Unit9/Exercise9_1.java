package Unit9;

public class Exercise9_1 {

    // compile error
    // i < 10, j < 10 -> i && j
    // i,j for-loop 안에서 선언되서 loop 밖에서 선언해줘야한다
    public static void main(String[] args) {

        int i, j;
        for (i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println((i + j));
        }

        System.out.println(i + " " + j);
    }

}
