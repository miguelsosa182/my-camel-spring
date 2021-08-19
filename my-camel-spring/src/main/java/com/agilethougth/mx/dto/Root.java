package com.agilethougth.mx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Root {
   public List<Card> cards;
}
