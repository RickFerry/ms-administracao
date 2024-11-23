package com.microservices.condominio.service;

import com.microservices.condominio.model.Apartamento;
import com.microservices.condominio.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartamentoService {
    @Autowired
    private ApartamentoRepository repository;

    public List<Apartamento> listar() {
        return repository.findAll();
    }

    public Apartamento salvar(Apartamento apartamento) {
        return repository.save(apartamento);
    }
}

