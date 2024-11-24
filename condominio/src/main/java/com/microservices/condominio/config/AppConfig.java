package com.microservices.condominio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

@Configuration
public class AppConfig {

    @Bean
    JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("MY-SECRET-KEY-ADDED-TO-MAKE-IT-256-BITS");
        return converter;
    }

    @Bean
    JwtTokenStore jwtTokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        return getJwtDecoder();
    }

    static JwtDecoder getJwtDecoder() {
        String secretKeyString = "TVktU0VDUkVULUtFWS1BRERFRC1UTy1NQUtFLUlULTI1Ni1CSVRT";
        byte[] secretKeyBytes = Base64.getDecoder().decode(secretKeyString);

        if (secretKeyBytes.length < 32) {
            throw new IllegalArgumentException("A chave secreta deve ter pelo menos 256 bits (32 bytes).");
        }
        SecretKey secretKey = new SecretKeySpec(secretKeyBytes, "HmacSHA256");
        return NimbusJwtDecoder.withSecretKey(secretKey).build();
    }
}
