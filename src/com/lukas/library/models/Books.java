package com.lukas.library.models;

public class Books {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;

    public Books(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
