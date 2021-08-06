package com.agilethougth.mx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {

    private String titulo;
    private String id;
    private int amount;
    private String descripcion;

}
