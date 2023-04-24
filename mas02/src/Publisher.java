import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private Year establishment;
    private List<Book> books = new ArrayList<>();

    public Publisher(String name, Year establishment) {
        this.name = name;
        this.establishment = establishment;
    }

    public void addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
            book.setPublisher(this);
        }else{
            System.out.println("this book alredy in books");
        }
    }
}
