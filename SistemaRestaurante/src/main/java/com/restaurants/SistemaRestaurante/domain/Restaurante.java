package com.restaurants.SistemaRestaurante.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalTime;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "restaurantes")
public class Restaurante {

    private String nome;
    private String email;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private int capacidadeMaxima;

}
