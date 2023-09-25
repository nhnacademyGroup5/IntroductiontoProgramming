package jinwoo.assignment.max_gcd;

public class Max extends MathOperation implements BinaryOperation<Integer>{
    @Override
    public Integer calculate(Integer x, Integer y){
        return Math.max(x, y);
    }

    public Integer calculate(Integer... numbers){
        return reduce(new Max(), numbers);
    }
}
