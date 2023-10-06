package com.nhnacademy.group.unit11.jiyh;

import java.util.Objects;

public class CD {
    private String author;
    private String title;
    private int year;
    private int price;
    private CD next;

    public CD(String author, String title, int year, int price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
        this.next = null;
    }

    public int getPrice() {
        return price;
    }

    public CD getNext() {
        return next;
    }

    public void setNext(CD next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CD cd = (CD) o;

        if (year != cd.year) {
            return false;
        }
        if (price != cd.price) {
            return false;
        }
        if (!Objects.equals(author, cd.author)) {
            return false;
        }
        return Objects.equals(title, cd.title);
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "CD{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
