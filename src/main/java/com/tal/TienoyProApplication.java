package com.tal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author tal
 */
@EnableScheduling
@SpringBootApplication
public class TienoyProApplication {

    public static void main(String[] args) {
        SpringApplication.run(TienoyProApplication.class, args);
    }

}
