package Infrastructure;

import Application.EventFacade;
import Domain.model.Event;
import Domain.model.User;
import Domain.repository.IEventService;
import Domain.service.EventServiceProxy;


public class Main {
    public static void main(String[] args) {
        User registeredUser = new User(true, false);
        User adminUser = new User(true, true);
        User anonymousUser = new User(false, false);

        // Proxy Pattern
        IEventService eventServiceProxy = new EventServiceProxy(registeredUser);

        // Facade Pattern
        EventFacade eventFacade = new EventFacade(eventServiceProxy);

        Event event = new Event(1, "Birthday Party");

        eventFacade.createEvent(event);
        eventFacade.modifyEvent(event);
        eventFacade.getEvent(1);
        eventFacade.activateEvent(1);
        eventFacade.deactivateEvent(1);

        System.out.println("\nUsing admin user:");
        eventServiceProxy = new EventServiceProxy(adminUser);
        eventFacade = new EventFacade(eventServiceProxy);

        eventFacade.createEvent(event);
        eventFacade.modifyEvent(event);
        eventFacade.getEvent(1);
        eventFacade.activateEvent(1);
        eventFacade.deactivateEvent(1);

        System.out.println("\nUsing anonymous user:");
        eventServiceProxy = new EventServiceProxy(anonymousUser);
        eventFacade = new EventFacade(eventServiceProxy);

        eventFacade.createEvent(event);
        eventFacade.modifyEvent(event);
        eventFacade.getEvent(1);
        eventFacade.activateEvent(1);
        eventFacade.deactivateEvent(1);
    }
}