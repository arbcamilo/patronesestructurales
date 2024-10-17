package Domain.service;

import Domain.model.Event;
import Domain.model.User;
import Domain.repository.IEventService;

public class EventServiceProxy implements IEventService {
    private final EventService eventService;
    private final User currentUser;

    public EventServiceProxy(User currentUser) {
        this.eventService = new EventService();
        this.currentUser = currentUser;
    }

    @Override
    public void createEvent(Event event) {
        if (currentUser.isRegistered()) {
            eventService.createEvent(event);
        } else {
            System.out.println("Unauthorized: Only registered users can create events.");
        }
    }

    @Override
    public void modifyEvent(Event event) {
        if (currentUser.isAdmin() || currentUser.isRegistered()) {
            eventService.modifyEvent(event);
        } else {
            System.out.println("Unauthorized: Only registered users and admins can modify events.");
        }
    }

    @Override
    public Event getEvent(int eventId) {
        return eventService.getEvent(eventId);
    }

    @Override
    public void activateEvent(int eventId) {
        if (currentUser.isAdmin()) {
            eventService.activateEvent(eventId);
        } else {
            System.out.println("Unauthorized: Only admins can activate events.");
        }
    }

    @Override
    public void deactivateEvent(int eventId) {
        if (currentUser.isAdmin()) {
            eventService.deactivateEvent(eventId);
        } else {
            System.out.println("Unauthorized: Only admins can deactivate events.");
        }
    }
}
