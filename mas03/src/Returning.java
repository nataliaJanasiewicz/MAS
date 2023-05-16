import java.time.LocalDate;

public class Returning extends Event{
    private LocalDate actualReturnDate;
    private int delay;

    public Returning(int eventId, LocalDate eventDate, LocalDate actualReturnDate, int delay) {
        super(eventId, eventDate);
        this.actualReturnDate = actualReturnDate;
        this.delay = delay;
    }

    public Returning(Event prevEvent, LocalDate actualReturnDate, int delay) {
        super(prevEvent.getEventId(), prevEvent.getEventDate());
        this.actualReturnDate = actualReturnDate;
        this.delay = delay;
    }

    public LocalDate getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
