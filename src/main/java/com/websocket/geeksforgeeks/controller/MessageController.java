package com.websocket.geeksforgeeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controlador para manejar la vista de la página del cliente
@Controller
public class MessageController {

    @GetMapping("/")
    public String index() {
        return "client";
    }
}
