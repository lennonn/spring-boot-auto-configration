package com.example.service;


import lombok.Data;

@Data
public class MyService {
    boolean autoConfig;
    public MyService(boolean autoConfig) {
        this.autoConfig=autoConfig;
    }
    public void sayHello(){
        System.out.println("hello spring boot auto configration");
    }
}