import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shelf {
    private static Set<Shelf> shelfExtent = new HashSet<>();

    Bookstand bookstand;
    List<CopyOfABook> copyOfABooks = new ArrayList<>();
    String position;

    private Shelf(Bookstand bookstand, String position, List<CopyOfABook> copyOfABooks){
        this.bookstand=bookstand;
        this.copyOfABooks = List.copyOf(copyOfABooks);
        this.position = position;
    }

    public static Shelf createShelf(Bookstand bookstand, String position,List<CopyOfABook> copyOfABooks) throws Exception {
        if(bookstand == null){
            throw new Exception("Bookstand does not exist!");
        }
        Shelf shelf = new Shelf(bookstand,position, copyOfABooks);
        bookstand.addShelf(shelf);
        return shelf;
    }

}
