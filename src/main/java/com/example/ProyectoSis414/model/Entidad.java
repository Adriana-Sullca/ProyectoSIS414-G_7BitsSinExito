package com.example.ProyectoSis414.model;

public class Entidad {

    private int gestion;
    private int entidad;
    private String descEnt;
    private String siglaEnt;

    public Entidad() {}

    public Entidad(int gestion, int entidad, String descEnt, String siglaEnt) {
        this.gestion = gestion;
        this.entidad = entidad;
        this.descEnt = descEnt;
        this.siglaEnt = siglaEnt;
    }

    public int getGestion() { return gestion; }
    public void setGestion(int gestion) { this.gestion = gestion; }

    public int getEntidad() { return entidad; }
    public void setEntidad(int entidad) { this.entidad = entidad; }

    public String getDescEnt() { return descEnt; }
    public void setDescEnt(String descEnt) { this.descEnt = descEnt; }

    public String getSiglaEnt() { return siglaEnt; }
    public void setSiglaEnt(String siglaEnt) { this.siglaEnt = siglaEnt; }
}
