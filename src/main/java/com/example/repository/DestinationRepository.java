package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
