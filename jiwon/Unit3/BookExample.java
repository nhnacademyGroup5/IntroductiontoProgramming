package Unit3;

public class BookExample {
    public static void main(String[] args) {
        TextBook t1 = new TextBook("java", "jiwon", "computer", "cho");
        System.out.println(t1);
        Book b2 = new Book("vaja", "wonji");

        Novel b3 = new Novel("vaja", "wonji", "ttt");

        System.out.println(b2 + " " + b3);

        t1.setPrice(1000);
        System.out.println(t1 + " " + t1.getPrice());
    }
}
