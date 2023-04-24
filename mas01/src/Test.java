import com.sun.source.util.SourcePositions;

import java.time.LocalDate;

public class Test {
    public static void createBooks(){
        Author author1 = new Author("J.R.R", "Tolkien");
        Author author2 = new Author("Hajime", "Isayama");

        Book book1 = new Book("Lord of the rings", 1178, author1,"fantasy,adventure");
        Book book2 = new Book("Attack on titan", 208, author2,"anime");

        System.out.println("books created");
    }

    public static void createAuthors(){
        Author author1 = new Author("John" , "Green");
        Author author2 = new Author("Stephen", "King");

        System.out.println("authors created");

    }

    public static void borrowBook(){
        if(Book.getAllBooks().size() > 1) {
            Book book = Book.getAllBooks().get(0);
            LocalDate now = LocalDate.now();
            book.setBorrowDate(now);
            System.out.println("Book " + book + " borrowed at : " + now);
        }else{
            System.out.println("no books in library");
        }
    }

    public static void chechkReturnTime(){
        if(Book.getAllBooks().size() > 1) {
            Book book = Book.getAllBooks().get(0);
            LocalDate returnDate = book.getDueDate();
            System.out.println("Book " + book + " due to: " + returnDate);
        }else{
            System.out.println("no books in library");
        }
    }

    public static void chechkReturnTimeNull(){
        if(Book.getAllBooks().size() > 1) {
            Book book = Book.getAllBooks().get(1);
            LocalDate returnDate = book.getDueDate();
            System.out.println("Book " + book + " due to: " + returnDate);
        }else{
            System.out.println("no books in library");
        }
    }

}
