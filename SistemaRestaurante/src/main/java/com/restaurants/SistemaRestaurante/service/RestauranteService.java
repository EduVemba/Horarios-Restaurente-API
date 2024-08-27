package com.restaurants.SistemaRestaurante.service;

import com.restaurants.SistemaRestaurante.domain.Restaurante;
import com.restaurants.SistemaRestaurante.repository.RestauranteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }
    public List<Restaurante> findAll() {
        return restauranteRepository.findAll();
    }
}
