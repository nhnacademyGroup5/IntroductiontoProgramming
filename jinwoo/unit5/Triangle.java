package jinwoo.unit5;

import java.util.Arrays;

// Ex. 5.2. ~ 5.4.
public class Triangle {
    private int max, mid, min;
    private Integer[] sides = new Integer[3];

    public int getMax() {
        return max;
    }

    public int getMid() {
        return mid;
    }

    public int getMin() {
        return min;
    }
    
    public Triangle(int ... values) {
        if(values.length !=3) throw new IllegalArgumentException("입력값이 너무 작거나 많습니다.");
        for (int i = 0; i < 3; i++) {
            this.sides[i] = values[i];
        }
        Arrays.sort(sides, (Integer a, Integer b) -> b - a);
        this.max = sides[0];
        this.mid = sides[1];
        this.min = sides[2];
    }

    public String typeOfTriangle(){
        int count = 0;
        for (int i = 0; i < this.sides.length; i++) {
            for (int j = i+1; j < this.sides.length; j++) {
                if(this.sides[i] == this.sides[j]) count++;
            }
        }
        if(max >= mid + min) throw new IllegalArgumentException("삼각형이 성립할 수 없습니다.");
        if(count == 0){
            return "it is irregular";
        } else if (count == 1){
            return "it is symmetric";
        } else{
            return "it is regular";
        }
    }

    public int perimeter(){
        return this.max + this.mid + this.min;
    }

    public double area(){
        int s = perimeter()/2;
        int tmp = s;
        for (int i = 0; i < sides.length; i++) {
            tmp *= (s-sides[i]);
        }
        double result = Math.sqrt(tmp);
        return result;
    }
}
