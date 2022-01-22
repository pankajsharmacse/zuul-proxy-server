package com.webapi.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.webapi.AppPackageMarker;

import java.util.Properties;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackageClasses = {
        AppPackageMarker.class
})
@EnableZuulProxy
public class TIZuulProxyServer{

    public static void main(String[] args) {

        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(TIZuulProxyServer.class);
        springApplicationBuilder.sources(TIZuulProxyServer.class)
                .properties(getProperties())
                .run(args);
    }

    static Properties getProperties() {
        Properties props = new Properties();
        //for running in local the property file location is given in pom.xml copy-appcontext task, the file is copied from the location to web-inf/classes during mvn package task
        //for linux
//        props.put("spring.config.additional-location", "/app/config/TI-Zuul-Proxy-Server/");
        //for Windows
		props.put("spring.config.additional-location", "../../Insights/cfg/");
        props.put("spring.config.name", "appconfig");

        return props;
    }


}

