package com.tal.experiment;

import com.tal.base.ai.annotation.EnableAI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Experiment part
 *
 * @Author: Tal
 * @Date: 2020/6/12 15:27
 */
@EnableAI
@SpringBootApplication
public class ExperimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExperimentApplication.class, args);
    }
}
