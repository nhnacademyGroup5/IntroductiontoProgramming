package ch4;

public class Exercise3{
    
    static double arithmeticMean(double... number){
        double sum = 0;
        for(int i=0; i<number.length; i++){
            if(number[i] == 0)
                throw new ArithmeticException();

            sum += number[i];
        }
        return sum / number.length;
    }

    static double geometricMean(double... number){
        double mul = 1.0;
        for(int i=0; i<number.length; i++){
            if(number[i] == 0)
                throw new ArithmeticException();

            mul *= number[i];
        }
        return Math.sqrt(mul);
    }

    static int max(int x, int y){
        return (x > y) ? x : y;
    }
}