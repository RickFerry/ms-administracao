package com.microservices.condominio.service;

import com.microservices.condominio.model.Ocorrencia;
import com.microservices.condominio.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaService {
    @Autowired
    private OcorrenciaRepository repository;

    public List<Ocorrencia> listar() {
        return repository.findAll();
    }

    public Ocorrencia salvar(Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }
}

