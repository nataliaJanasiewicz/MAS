import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    List<Borrowing> borrowingHistory = new ArrayList<>();

    public Librarian(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public void addBoorowing(Borrowing borrowing){
        if(!borrowingHistory.contains(borrowing)){
            borrowingHistory.add(borrowing);
            borrowing.addLibrarian(this);
        }
    }
}
