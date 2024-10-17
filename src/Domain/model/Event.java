package Domain.model;

public class Event {
    private int eventId;
    private String eventName;

    public Event(int eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}