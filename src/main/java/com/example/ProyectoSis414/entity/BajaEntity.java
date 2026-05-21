package com.example.ProyectoSis414.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bajas")
public class BajaEntity {

    @Id
    private int codbaja;
    private String descbaja;

    public BajaEntity() {}

    public int getCodbaja() { return codbaja; }
    public void setCodbaja(int codbaja) { this.codbaja = codbaja; }

    public String getDescbaja() { return descbaja; }
    public void setDescbaja(String descbaja) { this.descbaja = descbaja; }
}

