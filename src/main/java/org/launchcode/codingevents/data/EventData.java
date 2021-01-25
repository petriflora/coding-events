package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //need a place to put events (data structure) - integers are the event ids
    private static final Map<Integer, Event> events = new HashMap<>();

    //add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    //get a single event
    public static Event getById(int id) {
        return events.get(id);
    }

    //get all events - Collection is an interface, extends Iterable and allows looping over a list
    public static Collection<Event> getAll() {
        return events.values();
    }

    //remove an event
    public static void remove(int id) {
        events.remove(id);
    }
}
