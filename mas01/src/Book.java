import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book  implements Serializable {

    private static List<Book> bookExtent = new ArrayList<>();

    private String title;
    private int pages;

    private Author author;
    //atrybut wielokrotny
    private List<String> genres = new ArrayList<>();

    //atrybut opcjonalny
    private LocalDate borrowDate = null;

    //atrybut klasowy
    private static Duration maxBorrowTime = Duration.ofDays(30);

    //atrybut wyliczany
    public LocalDate getDueDate(){
        if(borrowDate !=  null) {
            return borrowDate.plusDays(maxBorrowTime.toDays());
        }else{
            System.out.println("ta ksiazka nie zostala jeszcze wyporzyczona");
            return null;
        }

    }

    public Book(){
        bookExtent.add(this);
    }

    public Book(String title, int pages, Author author, String genres){
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.genres = Arrays.stream(genres.split(",")).toList();
        bookExtent.add(this);
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){ return title;}

    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return author;
    }
    public void setBorrowDate(LocalDate borrowDate){
        this.borrowDate = borrowDate;
    }
    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    public List<String> getGenres(){
        return genres;
    }
    public void setGenres(String genres){
        this.genres = Arrays.stream(genres.split(",")).toList();
    }

    //metoda klasowa
    public static double chargeInterest(int daysAfterDueDate){
        return 3.50 * daysAfterDueDate;
    }

    //przeciazenie
    public static double chargeInterest(int daysAfterDueDate, double discount){
        return 3.50 * daysAfterDueDate * (1-discount);
    }

    public static void writeExtent(ObjectOutputStream stream) throws IOException {
        stream.writeObject(bookExtent);
    }

    public static void readExtent(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        bookExtent = (ArrayList<Book>) stream.readObject();
    }

    public static void show(){
        for(Book book : bookExtent){
            System.out.println(book);
        }
    }

    public static List<Book> getAllBooks(){
        return bookExtent;
    }

    @Override
    public String toString(){
        return getTitle() + " " + getPages() + " " + getAuthor() + " genres: " + getGenres().toString();
    }


}
