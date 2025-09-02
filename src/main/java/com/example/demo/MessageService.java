package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessagePrinter messagePrinter;

    public MessageService(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void displayMessage() {
        messagePrinter.printMessage();
    }
}