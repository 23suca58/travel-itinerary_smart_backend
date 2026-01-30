package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.entity.Destination;
import com.example.service.DestinationService;

@CrossOrigin(origins = "http://localhost:3003")
@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private final DestinationService service;

    public DestinationController(DestinationService service) {
        this.service = service;
    }

    @PostMapping
    public Destination create(@RequestBody Destination destination) {
        return service.save(destination);
    }

    @GetMapping
    public List<Destination> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Destination update(@PathVariable Long id,
                              @RequestBody Destination destination) {
        return service.update(id, destination);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
