import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String firstName;
    private String lastName;

    List<Borrowing> borrowingHistory = new ArrayList<>();

    public Reader(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBoorowing(Borrowing borrowing){
        if(!borrowingHistory.contains(borrowing)){
            borrowingHistory.add(borrowing);
            borrowing.addReader(this);
        }
    }
}
