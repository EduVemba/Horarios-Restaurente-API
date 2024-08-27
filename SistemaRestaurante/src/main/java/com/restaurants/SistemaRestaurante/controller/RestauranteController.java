package com.restaurants.SistemaRestaurante.controller;

import com.restaurants.SistemaRestaurante.domain.Restaurante;
import com.restaurants.SistemaRestaurante.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class RestauranteController {

    private final RestauranteService restauranteService;

   @Autowired
    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @GetMapping
    public List<Restaurante> getRestaurantes() {
       return restauranteService.findAll();
    }
}
