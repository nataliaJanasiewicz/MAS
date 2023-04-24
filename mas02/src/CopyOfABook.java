import java.util.ArrayList;
import java.util.List;

public class CopyOfABook {
    int inventoryNumber;
    Book book;
    String status;
    String state;
    List<Borrowing> borrowingHistory = new ArrayList<>();

    public CopyOfABook(int inventoryNumber, Book book, String status, String state) {
        this.inventoryNumber = inventoryNumber;
        this.book = book;
        this.status = status;
        this.state = state;
    }

    public void addBoorowing(Borrowing borrowing){
        if(!borrowingHistory.contains(borrowing)){
            borrowingHistory.add(borrowing);
            borrowing.addBook(this);
        }
    }
}
