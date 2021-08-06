package com.agilethougth.mx.service;

import com.agilethougth.mx.dto.Item;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemServiceImpl implements  ItemService{

    private List<Item> list = new ArrayList<>();


    /*@PostConstruct
    public void initDB() {
        list.add(new Item("Cuenta","1",150000,"Cuenta de nomina"));
        list.add(new Item("Pago","2",150000,"Cuenta de pago"));
        list.add(new Item("Transferencia","3",150000,"Transferencias"));
        list.add(new Item("Autorizacion","4",150000,"Autorizacion"));
    }*/

@Override
    public List<Item> getItems(){
    list.add(new Item("Cuenta","1",150000,"Cuenta de nomina"));
    list.add(new Item("Pago","2",150000,"Cuenta de pago"));
    list.add(new Item("Transferencia","3",150000,"Transferencias"));
    list.add(new Item("Autorizacion","4",150000,"Autorizacion"));
    return list;
    }

}