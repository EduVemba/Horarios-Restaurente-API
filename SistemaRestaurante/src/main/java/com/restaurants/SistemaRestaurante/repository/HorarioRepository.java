package com.restaurants.SistemaRestaurante.repository;

import com.restaurants.SistemaRestaurante.domain.Horarios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface HorarioRepository
        extends MongoRepository<Horarios, LocalDateTime> {
}
