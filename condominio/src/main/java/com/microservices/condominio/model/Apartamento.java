package com.microservices.condominio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "apartamentos")
public class Apartamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private int andar;

    @ManyToOne
    @JoinColumn(name = "bloco_id")
    @JsonBackReference
    private Bloco bloco;
}
