package com.sales.api.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        ApiApplication.class,
        Jsr310Converters.class
})
public class ApiApplication {

    public static void main (String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
