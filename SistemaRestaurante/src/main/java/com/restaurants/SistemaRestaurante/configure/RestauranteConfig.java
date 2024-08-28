package com.restaurants.SistemaRestaurante.configure;

import com.restaurants.SistemaRestaurante.domain.Restaurante;
import com.restaurants.SistemaRestaurante.repository.RestauranteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.List;

@Configuration
public class RestauranteConfig {

    @Bean
    CommandLineRunner commandLineRunner(RestauranteRepository restauranteRepository) {
        return args -> {
            Restaurante horario1 = new Restaurante(
                    "Looxour",
                    "loxour@gmail.com",
                    LocalTime.of(20,0),
                    LocalTime.of(22,0),
                    4
            );
            Restaurante horario2 = new Restaurante(
                    "Looxour",
                    "loxour@gmail.com",
                    LocalTime.of(22,30),
                    LocalTime.of(0,30),
                    4
            );
            restauranteRepository.saveAll(List.of(horario1,horario2));
        };
    }
}
