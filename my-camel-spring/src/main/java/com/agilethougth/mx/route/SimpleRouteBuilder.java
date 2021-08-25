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
        restConfiguration().component("restlet").enableCORS(true)
        .corsHeaderProperty("Access-Control-Allow-Origin","http://localhost:4200")
        .corsHeaderProperty("Access-Control-Allow-Methods", "GET")
        .corsHeaderProperty("Access-Control-Max-Age", "3600")
        .corsHeaderProperty("Access-Control-Allow-Headers", "*")
        .bindingMode(RestBindingMode.json);
        rest().get("/api/v1/private/get/items/online").produces(MediaType.APPLICATION_JSON_VALUE)
        .route()
        .setHeader("Access-Control-Allow-Credentials", constant(true))
        .setBody().constant(cardService.getRoot());
    }
}
