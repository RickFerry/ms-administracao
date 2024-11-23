package com.microservices.condominio.repository;

import com.microservices.condominio.model.Bloco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocoRepository extends JpaRepository<Bloco, Long> {
}
