import com.lukas.library.models.Books;
import com.lukas.library.models.Library;
import com.lukas.library.models.Users;

public class Main {
    public static void main(String[] args) {
        Library biblioteca = new Library();

        Books livro1 = new Books("Java: The Complete Reference", "Herbert Schildt", 800);
        Books livro2 = new Books("Design Patterns", "Erich Gamma", 350);

        Users usuario1 = new Users("Alice", 1);
        Users usuario2 = new Users("Bob", 2);

        biblioteca.addBook(livro1);
        biblioteca.addBook(livro2);

        biblioteca.addUser(usuario1);
        biblioteca.addUser(usuario2);

        biblioteca.lendBook(livro1, usuario1);
        biblioteca.lendBook(livro2, usuario2);

        biblioteca.showBookAvailable();
        biblioteca.showUsersWithLoanBook();

        biblioteca.returnBook(livro1);

        biblioteca.showBookAvailable();
        biblioteca.showUsersWithLoanBook();
    }
}