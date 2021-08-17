package com.agilethougth.mx.main;

import com.agilethougth.mx.route.SimpleRouteBuilder;
import org.apache.camel.main.Main;

public class App {
    public static void main(final String[] args) throws Exception {
        Main main = new Main();
        main.addRouteBuilder(new SimpleRouteBuilder());
        main.run(args);
    }

}
