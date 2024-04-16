package ru.tamtam.TamTam.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tamtam.TamTam.model.Event;
import ru.tamtam.TamTam.repository.InMemoryEventDAO;
import ru.tamtam.TamTam.service.EventService;

import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryEventServiceImpl implements EventService {
    private final InMemoryEventDAO repository;

    @Override
    public List<Event> findAllEvents() {
        return repository.findAllEvents();
    }

    @Override
    public Event saveEvent(Event event) {
        return repository.saveEvent(event);
    }

    @Override
    public Event findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Event updateEvent(Event event) {
        return repository.updateEvent(event);
    }

    @Override
    public void deleteEvent(String name) {
        repository.deleteEvent(name);
    }
}
