package com.agilethougth.mx.route;

import com.agilethougth.mx.dto.Item;
import com.agilethougth.mx.service.ItemService;
import com.agilethougth.mx.service.ItemServiceImpl;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimpleRouteBuilder extends RouteBuilder {


    ItemServiceImpl itemService = new ItemServiceImpl();

    @Override
    public void configure() throws Exception {
        restConfiguration().component("restlet").port(8081).host("localhost").bindingMode(RestBindingMode.json);
        System.out.println(itemService.getItems());
        rest().get("/getItems").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(()-> itemService.getItems());
        //rest().get("/getItems").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody((Expression) itemService.getItems());
    }
}
