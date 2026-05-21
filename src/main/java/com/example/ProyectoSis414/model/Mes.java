package com.example.ProyectoSis414.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mes")
public class Mes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int mes;
    private String nommes;

    public Mes() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public String getNommes() { return nommes; }
    public void setNommes(String nommes) { this.nommes = nommes; }
}