package com.example.ProyectoSis414.model;

import jakarta.persistence.*;

@Entity
@Table(name = "baja")
public class Baja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codbaja;
    private String descbaja;

    public Baja() {}

    public Long getCodbaja() { return codbaja; }
    public void setCodbaja(Long codbaja) { this.codbaja = codbaja; }

    public String getDescbaja() { return descbaja; }
    public void setDescbaja(String descbaja) { this.descbaja = descbaja; }
}