package com.agilethougth.mx.route;


import com.agilethougth.mx.service.ItemServiceImpl;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;


@Component
public class SimpleRouteBuilder extends RouteBuilder {

    ItemServiceImpl itemService = new ItemServiceImpl();

    @Override
    public void configure() throws Exception {
        restConfiguration().component("restlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
        rest().get("/api/v1/private/get/items/2").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody().constant(itemService.getItems());

    }
}
