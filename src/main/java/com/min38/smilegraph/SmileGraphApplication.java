package com.min38.smilegraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/naver-cloud.properties")
public class SmileGraphApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmileGraphApplication.class, args);
    }

}
