package com.agilethougth.mx.configuration;

import org.apache.camel.component.restlet.RestletComponent;
import org.restlet.Component;
import org.restlet.ext.spring.SpringServerServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {
    @Bean
    public ServletRegistrationBean restletServletBean() {

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SpringServerServlet(),
                "");
        Map<String, String> initParams = new HashMap<>(1);
        initParams.put(SpringServerServlet.Component_BEAN_PARAM_NAME, "restletComponent");
        servletRegistrationBean.setInitParameters(initParams);
        servletRegistrationBean.setName("RestletServlet");
        System.out.println(servletRegistrationBean.getServletName());
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    @Bean
    public Component restletComponent() {
        return new Component();
    }

    @Bean
    public RestletComponent restletComponentService() {
        return new RestletComponent(restletComponent());
    }


}
