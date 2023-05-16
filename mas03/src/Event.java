import java.time.LocalDate;

public abstract class Event {
    private int eventId;
    private LocalDate eventDate;

    public Event(int eventId, LocalDate eventDate) {
        this.eventId = eventId;
        this.eventDate = eventDate;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
