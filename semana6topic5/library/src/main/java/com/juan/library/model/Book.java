package com.juan.library.model;

public class Book {

    private int id;
    private String name;
    private String author;
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book() {

    }

    public Book(int bookID, String bookName, String bookAuthor, int bookYear) {
        setId(bookID);
        setName(bookName);
        setAuthor(bookAuthor);
        setYear(bookYear);
    }
}
