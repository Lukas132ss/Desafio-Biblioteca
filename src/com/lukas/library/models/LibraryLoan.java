package com.lukas.library.models;

import java.time.LocalDate;

public class LibraryLoan {
    private Books book;
    private Users user;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public LibraryLoan(Books book, Users user, LocalDate loanDate, LocalDate dueDate) {
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public Books getBook() {
        return book;
    }

    public Users getUser() {
        return user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
