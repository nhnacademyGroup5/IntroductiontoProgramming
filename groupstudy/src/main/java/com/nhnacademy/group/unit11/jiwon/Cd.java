package com.nhnacademy.group.unit11.jiwon;
public class Cd {
    private String author;
    private String title;
    private int publicationYear;
    private int price;

    public Cd(String author, String title, int publicationYear, int price) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return author + " - " + title + " (" + publicationYear + "), Price: $" + price;
    }
}
