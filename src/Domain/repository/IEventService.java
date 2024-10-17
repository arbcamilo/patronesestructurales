package Domain.repository;

import Domain.model.Event;

public interface IEventService {
    void createEvent(Event event);
    void modifyEvent(Event event);
    Event getEvent(int eventId);
    void activateEvent(int eventId);
    void deactivateEvent(int eventId);
}
