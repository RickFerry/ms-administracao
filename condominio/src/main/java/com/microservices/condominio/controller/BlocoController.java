package com.microservices.condominio.controller;

import com.microservices.condominio.model.Bloco;
import com.microservices.condominio.service.BlocoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blocos")
public class BlocoController {
    @Autowired
    private BlocoService service;

    @GetMapping
    public List<Bloco> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Bloco> salvar(@RequestBody Bloco bloco) {
        return ResponseEntity.ok(service.salvar(bloco));
    }
}
