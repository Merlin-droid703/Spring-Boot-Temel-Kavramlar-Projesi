package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    public void printMessage() {
        System.out.println("Bu mesaj MessagePrinter tarafından yazdırıldı!");
    }
}