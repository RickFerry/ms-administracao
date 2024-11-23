package com.microservices.condominio.controller;

import com.microservices.condominio.model.Ocorrencia;
import com.microservices.condominio.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {
    @Autowired
    private OcorrenciaService service;

    @GetMapping
    public List<Ocorrencia> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<Ocorrencia> salvar(@RequestBody Ocorrencia ocorrencia) {
        return ResponseEntity.ok(service.salvar(ocorrencia));
    }
}

