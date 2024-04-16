package ru.tamtam.TamTam.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tamtam.TamTam.model.Event;
import ru.tamtam.TamTam.service.EventService;

import java.util.List;

@RestController
@RequestMapping("api/v1/events")
@AllArgsConstructor
public class EventController {

    private final EventService service;

    @GetMapping
    public List<Event> findAllEvents(){
        //todo
        return service.findAllEvents();
    }

    @PostMapping("save_event")
    public String saveEvent(@RequestBody Event event){
        service.saveEvent(event);
        return "Event saved successfully";
    }

    @GetMapping("/{name}")
    public Event findByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PutMapping("update_event")
    public Event updateEvent(@RequestBody Event event){
        return service.updateEvent(event);
    }

    @DeleteMapping("delete_event/{name}")
    public void deleteEvent(@PathVariable String name){
        service.deleteEvent(name);
    }
}
