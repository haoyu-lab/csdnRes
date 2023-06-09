package com.huyoa.csdnRes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CsdnResApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsdnResApplication.class, args);
    }

}
