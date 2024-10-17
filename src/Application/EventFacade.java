package Application;


import Domain.model.Event;
import Domain.repository.IEventService;

public class EventFacade {
    private final IEventService eventService;

    public EventFacade(IEventService eventService) {
        this.eventService = eventService;
    }

    public void createEvent(Event event) {
        eventService.createEvent(event);
    }

    public void modifyEvent(Event event) {
        eventService.modifyEvent(event);
    }

    public Event getEvent(int eventId) {
        return eventService.getEvent(eventId);
    }

    public void activateEvent(int eventId) {
        eventService.activateEvent(eventId);
    }

    public void deactivateEvent(int eventId) {
        eventService.deactivateEvent(eventId);
    }
}