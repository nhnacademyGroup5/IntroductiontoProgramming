package jinwoo.unit4;

import jinwoo.unit3.Product;

public class TestProduct {
    public static void main (String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
      }
}
