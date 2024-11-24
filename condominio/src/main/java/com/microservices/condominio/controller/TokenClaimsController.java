package com.microservices.condominio.controller;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenClaimsController {

    private final JwtDecoder jwtDecoder;

    public TokenClaimsController(JwtDecoder jwtDecoder) {
        this.jwtDecoder = jwtDecoder;
    }

    @GetMapping("/token-claims")
    public Object getTokenClaims(@RequestParam String token) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("Token must not be null or empty");
        }
        Jwt jwt = jwtDecoder.decode(token);
        return jwt.getClaims();
    }
}
