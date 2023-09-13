package Unit4;

public class Product {


    private final String name;
    private int pieces;

    public Product(String name) {
        this.name = name;
        this.pieces = 0;
    }

    public void downLoad(int i) {
        this.pieces += i;

    }

    public void upLoad(int i) {
        this.pieces -= i;

    }

    @Override
    public String toString() {
        return name + ", " + pieces + " pieces";
    }

    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }
}