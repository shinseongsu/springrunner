package com.springrunner.divelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.context.WebServerPortFileWriter;

@SpringBootApplication
public class DiveLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiveLogApplication.class, args);

    }

}
