package com.microservices.condominio.controller;

import com.microservices.condominio.model.Morador;
import com.microservices.condominio.service.MoradorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/moradores")
public class MoradorController {
    private final MoradorService service;

    @GetMapping
    public List<Morador> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Morador> salvar(@RequestBody Morador morador) {
        return ResponseEntity.ok(service.salvar(morador));
    }
}
