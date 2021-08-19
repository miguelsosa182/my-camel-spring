package com.agilethougth.mx.service;

import com.agilethougth.mx.dto.Card;
import com.agilethougth.mx.dto.Root;

import java.util.ArrayList;
import java.util.List;


public class CardServiceImpl implements  CardService{

    @Override
    public Root getRoot() {
       return new Root(getItems());
    }

    public List<Card> getItems(){
        List<Card> list = new ArrayList<>();
        list.add(new Card("Cuenta","1",150000,"Cuenta de nomina"));
        list.add(new Card("Pago","2",150000,"Cuenta de pago"));
        list.add(new Card("Transferencia","3",150000,"Transferencias"));
        list.add(new Card("Autorizacion","4",150000,"Autorizaciones"));
        return list;
    }

}
