package com.restaurants.SistemaRestaurante.service;


import com.restaurants.SistemaRestaurante.domain.Horarios;
import com.restaurants.SistemaRestaurante.repository.HorarioRepository;
import com.restaurants.SistemaRestaurante.repository.RestauranteRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final RestauranteRepository restauranteRepository;
    private final HorarioRepository horarioRepository;

    public AdminService(RestauranteRepository restauranteRepository, HorarioRepository horarioRepository) {
        this.restauranteRepository = restauranteRepository;
        this.horarioRepository = horarioRepository;
    }


    public void postNewTable(Horarios mesa){
        horarioRepository.save(mesa);
    }
}
