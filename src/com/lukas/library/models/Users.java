package com.lukas.library.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private String name;
    private int id;

    private List<Books> loanBooks;



    public Users(String name, int id) {
        this.name = name;
        this.id = id;
        this.loanBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Books> getLoanBooks() {
        return loanBooks;
    }

    public void addBorrowedBook(Books book) {
        this.loanBooks.add(book);
    }

    public void removeBorrowedBook(Books book) {
        this.loanBooks.remove(book);
    }
}
