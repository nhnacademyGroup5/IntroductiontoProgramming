package jinwoo.unit3;
public class Book {
    private String title;
    private String authors;
    private int price = 0;
    
    public String getTitle() {
        return title;
    }
    public String getAuthors() {
        return authors;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public Book(String title, String authors, int price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    public void printBook(){
        System.out.println(title);
        System.out.println(authors);
    }

    public void printBookPrice(){
        System.out.println(title + " | " + authors + " | " + price);
    }

}
