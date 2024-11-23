package com.microservices.condominio.service;

import com.microservices.condominio.model.Morador;
import com.microservices.condominio.repository.MoradorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MoradorService {
    private final MoradorRepository repository;

    public List<Morador> listar() {
        return repository.findAll();
    }

    public Morador salvar(Morador morador) {
        return repository.save(morador);
    }
}

