package Domain.service;


import Domain.model.Event;
import Domain.repository.IEventService;

public class EventService implements IEventService {
    @Override
    public void createEvent(Event event) {
        System.out.println("Event created: " + event);
    }

    @Override
    public void modifyEvent(Event event) {
        System.out.println("Event modified: " + event);
    }

    @Override
    public Event getEvent(int eventId) {
        System.out.println("Getting event with ID: " + eventId);
        return new Event(eventId, "Sample Event");
    }

    @Override
    public void activateEvent(int eventId) {
        System.out.println("Event activated with ID: " + eventId);
    }

    @Override
    public void deactivateEvent(int eventId) {
        System.out.println("Event deactivated with ID: " + eventId);
    }
}
