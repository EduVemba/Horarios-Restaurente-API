package com.restaurants.SistemaRestaurante.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@RequiredArgsConstructor
public class Horarios {

    private Restaurante restaurante;
    private LocalTime horario_de_entrada = restaurante.getHorarioAbertura();
    private LocalTime horario_de_Saida = restaurante.getHorarioFechamento();

}
