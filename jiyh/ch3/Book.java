package ch3;

public class Book {
    private String title;
    private String author;
    private int price;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void printBook(){
        System.out.println(title + " " + author);
    }

    public void printBookPrice(){
        System.out.println(title + " " + author + " " + price);
    }

    public void windowBook(){
        System.out.println(title + "\n" + author);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
