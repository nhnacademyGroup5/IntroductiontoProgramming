package Unit3;

import javax.swing.JOptionPane;

public class Book {
    private String title;
    private String authors;
    private int price;

    public Book(String t, String a) {
        title = t;
        authors = a;
    }

    public String printBook(String title, String authors) {
        return title + "\n" + authors;

    }

    public String printBookPrice(String title, String authors, int price) {
        return title + "\n" + authors + "\n" + price;
    }

    public void windowBook(String title, String authors) {
        JOptionPane.showMessageDialog(null, authors);
        JOptionPane.showMessageDialog(null, title);

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
