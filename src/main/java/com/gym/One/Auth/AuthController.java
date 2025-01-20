package com.gym.One.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService AuthService;

    @PostMapping(value="/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(AuthService.login(request));
    }
    @PostMapping(value="/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(AuthService.register(request));
    }

    @PostMapping("/login1")
    public ResponseEntity<String> login1() {
        // Lógica de login
        return ResponseEntity.ok("Login successful");
    }
}
