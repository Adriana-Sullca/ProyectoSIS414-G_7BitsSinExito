package com.example.ProyectoSis414.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo - Login";
    }
}