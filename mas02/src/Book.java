import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private static List<Book> bookExtent = new ArrayList<>();

    private String title;
    private int pages;
    private LocalDate releaseDate;
    private Publisher publisher;
    private Map<String,Author> authors = new HashMap<>();

    public Book(String title, int pages, LocalDate releaseDate, Publisher publisher) {
        this.title = title;
        this.pages = pages;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
        publisher.addBook(this);
    }

    public void setPublisher(Publisher publisher){
        if(this.publisher == null){
            this.publisher = publisher;
        }else{
            System.out.println("this book alredy has publisher");
        }
    }

    public String getTitle(){
        return title;
    }

    public void addAuthor(Author author){
        if(!authors.containsKey(author.getName())){
            authors.put(author.getName(), author);
            author.addBook(this);
        }else{
            System.out.println("this author laredy in authors");
        }

    }

    public void removeAuthor(Author author){
        authors.remove(author.getName());
        author.removeBook(this);
    }
}
