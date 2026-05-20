package com.example.ProyectoSis414.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codestado;

    private String nomestado;

    public EstadoEntity() {}

    public EstadoEntity(Long codestado, String nomestado) {
        this.codestado = codestado;
        this.nomestado = nomestado;
    }

    public Long getCodestado() { return codestado; }
    public void setCodestado(Long codestado) { this.codestado = codestado; }

    public String getNomestado() { return nomestado; }
    public void setNomestado(String nomestado) { this.nomestado = nomestado; }
}