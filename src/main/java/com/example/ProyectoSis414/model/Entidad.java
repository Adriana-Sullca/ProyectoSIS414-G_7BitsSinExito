package com.example.ProyectoSis414.model;

import jakarta.persistence.*;

@Entity
@Table(name = "entidades")
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int gestion;
    private int entidad;
    private String descEnt;
    private String siglaEnt;

    public Entidad() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getGestion() { return gestion; }
    public void setGestion(int gestion) { this.gestion = gestion; }

    public int getEntidad() { return entidad; }
    public void setEntidad(int entidad) { this.entidad = entidad; }

    public String getDescEnt() { return descEnt; }
    public void setDescEnt(String descEnt) { this.descEnt = descEnt; }

    public String getSiglaEnt() { return siglaEnt; }
    public void setSiglaEnt(String siglaEnt) { this.siglaEnt = siglaEnt; }
}