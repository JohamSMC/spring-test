package com.sebas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @GetMapping()
    public String getBasePath() {
        return ("<HTML><body> <a href=\"https://spring-test-production.up.railway.app/actuator\"> Link clik to go paths</a></body></HTML>");
    }
}
