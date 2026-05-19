package com.example.ProyectoSis414.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "objgastos")
public class ObjGastoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int gestion;
    private int partida;
    private String descrip;

    public ObjGastoEntity() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getGestion() { return gestion; }
    public void setGestion(int gestion) { this.gestion = gestion; }

    public int getPartida() { return partida; }
    public void setPartida(int partida) { this.partida = partida; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }
}