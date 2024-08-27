package com.restaurants.SistemaRestaurante.repository;

import com.restaurants.SistemaRestaurante.domain.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository
        extends MongoRepository<Restaurante, Integer> {
}
