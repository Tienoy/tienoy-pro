package com.tal.inter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * starter
 *
 * @Author: Tal
 * @Date: 2020/6/14 08:59
 */
@EnableFeignClients
@SpringBootApplication
public class InterApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterApplication.class, args);
    }
}
