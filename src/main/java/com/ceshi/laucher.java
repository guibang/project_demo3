package com.ceshi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class laucher {

        public static void main(String[] args) {
            SpringApplication.run(laucher.class);
        }

    String s = "dev";
}
