package com.riverfount;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private String publisher;

    public Book() {
    }

    public Book(String title, String author, int publishYear, String publisher) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
