package jinwoo.unit3;

import java.util.StringTokenizer;

// Ex 4.9.
public class Product {
    private String name;
    private int num = 0;
    private String unit;

    public Product(String input) {
        StringTokenizer st = new StringTokenizer(input);
        
        this.name = st.nextToken();
        this.num = Integer.valueOf(st.nextToken());
        this.unit = st.nextToken();
    }

    public void upLoad(int i) {
        num -= i;
    }

    public void downLoad(int i) {
        num += i;
    }

    @Override
    public String toString() {
        return name + ", " + num + " " + unit;
    }

}
