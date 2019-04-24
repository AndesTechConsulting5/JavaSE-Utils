package org.andestech.learning.rfb19.g4.utils;

import java.util.Random;

public class Book  implements  Comparable<Book>{
    private String title,author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    private int year;
    private int id;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        id = Math.abs(new Random().nextInt());

    }



    public String toString(){
        return "Book: " + title + ", by " + author +", " + year +
                ", [" +id + "].";
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }
}