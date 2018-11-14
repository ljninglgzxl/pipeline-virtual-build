package com.lg.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VirtualtestApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DockertestApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }
    @RequestMapping("/ubuntu")
    public String index(){
        return "the first spring-boot-project running in ubuntu!";
    }
}
