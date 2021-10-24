package com.example.helloapp;

import com.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAppApplication implements CommandLineRunner {

    @Autowired
    MyService myservice;

    public static void main(String[] args) {
        SpringApplication.run(HelloAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //System.out.println(myservice.isAutoConfig());
        myservice.sayHello();
    }
}
