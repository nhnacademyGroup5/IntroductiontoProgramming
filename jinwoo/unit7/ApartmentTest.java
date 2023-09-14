package jinwoo.unit7;

public class ApartmentTest {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(26, 101);
        System.out.println(apartment);
        apartment.moveIn("jinwoo");
        System.out.println(apartment);
    }
}
