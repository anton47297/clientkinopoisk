package org.example.kinopoiskclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KinopoiskclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(KinopoiskclientApplication.class, args);
    }

}
