package com.restaurants.SistemaRestaurante.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "restaurantes")
public class Restaurante {

    @Id
    private int id;
    private String nome;
    private String email;
    private LocalTime horario;

    public Restaurante(String nome, String email, LocalTime horario) {
        this.nome = nome;
        this.email = email;
        this.horario = horario;
    }
}
