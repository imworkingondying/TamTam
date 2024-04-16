package ru.tamtam.TamTam.service;


import org.springframework.stereotype.Service;
import ru.tamtam.TamTam.model.Event;

import java.util.List;

public interface EventService {
    List<Event> findAllEvents();
    Event saveEvent(Event event);
    Event findByName(String name);
    Event updateEvent(Event event);
    void deleteEvent (String name);
}
