package com.gym.One.Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping(value="/login")
    public String login(){
        return "Exito mi hermano, el login de los papurros";
    }
    @PostMapping(value="/register")
    public String register(){
        return "Hola como estas register";
    }

    @PostMapping("/login1")
    public ResponseEntity<String> login1() {
        // Lógica de login
        return ResponseEntity.ok("Login successful");
    }
}
