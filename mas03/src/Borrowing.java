import java.time.LocalDate;

public class Borrowing extends Event{
    private LocalDate borrowingDate;
    private LocalDate predictedReturnDate;

    public Borrowing(int eventId, LocalDate eventDate,LocalDate borrowingDate, LocalDate predictedReturnDate) {
        super(eventId,eventDate);
        this.borrowingDate = borrowingDate;
        this.predictedReturnDate = predictedReturnDate;
    }

    public Borrowing(Event prevEvent,LocalDate borrowingDate, LocalDate predictedReturnDate) {
        super(prevEvent.getEventId(),prevEvent.getEventDate());
        this.borrowingDate = borrowingDate;
        this.predictedReturnDate = predictedReturnDate;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getPredictedReturnDate() {
        return predictedReturnDate;
    }

    public void setPredictedReturnDate(LocalDate predictedReturnDate) {
        this.predictedReturnDate = predictedReturnDate;
    }
}
