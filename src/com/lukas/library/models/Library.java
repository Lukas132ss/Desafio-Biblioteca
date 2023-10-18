package com.lukas.library.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> booksRemaining;
    private List<Users> usersRegistered;
    private List<LibraryLoan> historyLoans;

    public Library() {
        this.booksRemaining = new ArrayList<>();
        this.usersRegistered = new ArrayList<>();
        this.historyLoans = new ArrayList<>();
    }

    public void addBook(Books book) {
        this.booksRemaining.add(book);
    }

    public void removeBook(Books book) {
        this.booksRemaining.remove(book);
    }

    public void addUser(Users user) {
        this.usersRegistered.add(user);
    }

    public void removeUser(Users user) {
        this.usersRegistered.remove(user);
    }

    public void lendBook(Books book, Users user) {
        if (!book.isAvailable() || user.getLoanBooks().size() >= 3) {
            System.out.println("Empréstimo não pode ser realizado.");
            return;
        }

        book.setAvailable(false);
        user.addBorrowedBook(book);
        LibraryLoan loan = new LibraryLoan(book, user, LocalDate.now(), null);
        historyLoans.add(loan);
    }
    public void returnBook(Books book) {
        book.setAvailable(true);
        for (Users user : usersRegistered) {
            if (user.getLoanBooks().contains(book)) {
                user.removeBorrowedBook(book);
                break;
            }
        }
    }

    public void showBookAvailable() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Books livro : booksRemaining) {
            System.out.println("    - " + livro.getTitle());
        }
        System.out.println();
    }

    public void showUsersWithLoanBook() {
        System.out.println("Usuários com livros emprestados:");
        for (Users usuario : usersRegistered) {
            List<Books> livrosEmprestados = usuario.getLoanBooks();
            if (!livrosEmprestados.isEmpty()) {
                System.out.println("- " + usuario.getName() + ":");
                for (Books livro : livrosEmprestados) {
                    System.out.println("  - " + livro.getTitle());
                }
            }
        }
        System.out.println();
    }

}
