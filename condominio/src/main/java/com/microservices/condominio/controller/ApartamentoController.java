package com.microservices.condominio.controller;

import com.microservices.condominio.model.Apartamento;
import com.microservices.condominio.service.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartamentos")
public class ApartamentoController {
    @Autowired
    private ApartamentoService service;

    @GetMapping
    public List<Apartamento> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Apartamento> salvar(@RequestBody Apartamento apartamento) {
        return ResponseEntity.ok(service.salvar(apartamento));
    }
}

