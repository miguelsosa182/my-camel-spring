package com.agilethougth.mx.route;

import com.agilethougth.mx.service.CardServiceImpl;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;


@Component
public class SimpleRouteBuilder extends RouteBuilder {

    CardServiceImpl cardService = new CardServiceImpl();

    @Override
    public void configure(){
        /**Con puerto definido*/
        //restConfiguration().component("restlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);

        /**Con el mismo puerto de Backbase*/
        restConfiguration().component("restlet").bindingMode(RestBindingMode.json);
        rest().get("/api/v1/private/get/items/2").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody().constant(cardService.getRoot());
    }
}
