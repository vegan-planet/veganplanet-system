package com.veganplanet.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.veganplanet"})
public class VeganplanetSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeganplanetSystemApplication.class, args);
    }

}
