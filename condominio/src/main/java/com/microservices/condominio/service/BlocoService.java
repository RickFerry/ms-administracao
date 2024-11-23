package com.microservices.condominio.service;

import com.microservices.condominio.model.Bloco;
import com.microservices.condominio.repository.BlocoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocoService {
    @Autowired
    private BlocoRepository repository;

    public List<Bloco> listar() {
        return repository.findAll();
    }

    public Bloco salvar(Bloco bloco) {
        return repository.save(bloco);
    }
}

