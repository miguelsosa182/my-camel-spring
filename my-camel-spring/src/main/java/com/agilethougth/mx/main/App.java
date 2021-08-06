package com.agilethougth.mx.main;

import com.agilethougth.mx.route.SimpleRouteBuilder;
import org.apache.camel.component.restlet.RestletComponent;
import org.apache.camel.main.Main;
import org.restlet.Component;
import org.restlet.ext.spring.SpringServerServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(final String[] args) throws Exception {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
        // Keep main thread alive for some time to let application finish processing the input files.
        //Thread.sleep(5000);
        //applicationContext.start();
        Main main = new Main();
        main.addRouteBuilder(new SimpleRouteBuilder());
        main.run(args);
    }

}
