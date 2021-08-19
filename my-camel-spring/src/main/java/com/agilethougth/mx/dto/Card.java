package com.agilethougth.mx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Card {
    private String titulo;
    private String id;
    private int amount;
    private String descripcion;
}
