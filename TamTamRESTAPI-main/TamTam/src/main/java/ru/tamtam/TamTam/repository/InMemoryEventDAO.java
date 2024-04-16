package ru.tamtam.TamTam.repository;
import org.springframework.stereotype.Repository;
import ru.tamtam.TamTam.model.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository

public class InMemoryEventDAO {
    private final List<Event> EVENTS = new ArrayList<>();

    public List<Event> findAllEvents() {
        return EVENTS;
    }

    public Event saveEvent(Event event) {
        EVENTS.add(event);
        return event;
    }

    public Event findByName(String name) {
        return EVENTS.stream()
                .filter(element -> element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public Event updateEvent(Event event) {
        var eventIndex = IntStream.range(0, EVENTS.size())
                .filter(index -> EVENTS.get(index).getName().equals(event.getName()))
                .findFirst()
                .orElse(-1);
        if(eventIndex > -1){
            EVENTS.set(eventIndex, event);
            return event;
        }
        return null;
    }

    public void deleteEvent(String name) {
        var event = findByName(name);
        if (event != null){
            EVENTS.remove(event);
        }
    }
}
