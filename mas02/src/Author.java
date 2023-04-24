import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {
    private static List<Author> authorExtent = new ArrayList<>();
    private List<String> firstNames;
    private String firstName;
    private List<String> lastNames;
    private String lastName;
    private Map<String,Book> books = new HashMap<>();

    public Author(List<String> firstNames, String firstName, List<String> lastNames, String lastName) {
        this.firstNames = firstNames;
        this.firstName = firstName;
        this.lastNames = lastNames;
        this.lastName = lastName;
    }

    public String getName(){
        return  firstName +" "+lastName;
    }


    public void addBook(Book book){
        if(!books.containsKey(book.getTitle())){
            books.put(book.getTitle(), book);
            book.addAuthor(this);
        }else{
            System.out.println("this author laredy in authors");
        }
    }

    public void removeBook(Book book){
        books.remove(book.getTitle());
        book.removeAuthor(this);
    }
}
