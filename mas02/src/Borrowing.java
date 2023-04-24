import java.time.Duration;
import java.time.LocalDate;

public class Borrowing {
    Librarian librarian;
    Reader reader;
    CopyOfABook copyOfABook;
    LocalDate borrowDate ;
    private static Duration maxBorrowTime = Duration.ofDays(30);

    public Borrowing(Librarian librarian, Reader reader, CopyOfABook copyOfABook, LocalDate borrowDate) {
        this.librarian = librarian;
        this.reader = reader;
        this.copyOfABook = copyOfABook;
        this.borrowDate = borrowDate;
        librarian.addBoorowing(this);
        reader.addBoorowing(this);
        copyOfABook.addBoorowing(this);
    }

    public void addBook(CopyOfABook book){
        if(copyOfABook == null){
            copyOfABook = book;
        }
    }

    public void addReader(Reader reader){
        if(this.reader == null){
            this.reader = reader;
        }
    }

    public void addLibrarian(Librarian librarian){
        if(this.librarian == null){
            this.librarian = librarian;
        }
    }
}
