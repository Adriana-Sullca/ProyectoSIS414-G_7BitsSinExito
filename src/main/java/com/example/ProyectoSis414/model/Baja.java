package com.example.ProyectoSis414.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Baja")
public class Baja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codbaja;
    private String descbaja;

    public Baja() {}


    public Integer getCodbaja() { return codbaja; }
    public void setCodbaja(Integer codbaja) { this.codbaja = codbaja; }

    public String getDescbaja() { return descbaja; }
    public void setDescbaja(String descbaja) { this.descbaja = descbaja; }
}
