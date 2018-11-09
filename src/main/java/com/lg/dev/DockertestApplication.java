package com.lg.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }
    @RequestMapping("/docker")
    public String index(){
        return "the second spring-boot-project running in docker!";
    }
}
