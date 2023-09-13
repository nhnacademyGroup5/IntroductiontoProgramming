package jinwoo;

public class BookEx {

    // Ex 3.8.
    public static void main(String[] args) {
        Textbook first = new Textbook("title", "jinwoo", "Physics", "Havard");
        System.out.println(first);

        Novel second = new Novel("title", "jinwoo", "S.F");
        System.out.println(second);

        first.setPrice(10000000);
        System.out.println(first.getPrice());
    }
}
