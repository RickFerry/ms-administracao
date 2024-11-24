package com.microservices.condominio.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenInfoController {

    @GetMapping("/token-info")
    public String getTokenInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username = authentication.getName();
        var authorities = authentication.getAuthorities();

        return "Usuário: " + username + ", Permissões: " + authorities.toString();
    }
}
