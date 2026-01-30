package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Destination;
import com.example.repository.DestinationRepository;

@Service
public class DestinationService {

    private final DestinationRepository repository;

    public DestinationService(DestinationRepository repository) {
        this.repository = repository;
    }

    public Destination save(Destination destination) {
        return repository.save(destination);
    }

    public List<Destination> getAll() {
        return repository.findAll();
    }

    public Destination update(Long id, Destination updated) {
        Destination dest = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Destination not found"));

        dest.setName(updated.getName());
        return repository.save(dest);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
