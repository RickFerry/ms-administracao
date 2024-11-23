package com.microservices.condominio.repository;

import com.microservices.condominio.model.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {
}
