package com.spring.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


public class Tea implements HotDrink {
    public void preparehotdrink() {
        System.out.println("PREPARING TEA");
    }
}