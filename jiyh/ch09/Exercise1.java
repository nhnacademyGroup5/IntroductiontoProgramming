package ch09;

public class Exercise1 {
    
    public static void main(String[] args) {


        // compile error
        // 1. for문에서의 조건식(syntax)
        // 2. for문 밖에서의 i, j 변수 사용(static sematic)

        for(int i=0, j=0; i<10 && j<10; i++, j++){
            System.out.println("I’ve printed out the sums of i and j up to "+ i + " , " + j);
            System.out.println(i + " + " + j + " = " + (i+j));
        }
         
        
    }
}
