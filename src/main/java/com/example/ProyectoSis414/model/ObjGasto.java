package com.example.ProyectoSis414.model;

public class ObjGasto {

    private int gestion;
    private int partida;
    private String descrip;

    public ObjGasto() {}

    public ObjGasto(int gestion, int partida, String descrip) {
        this.gestion = gestion;
        this.partida = partida;
        this.descrip = descrip;
    }

    public int getGestion() { return gestion; }
    public void setGestion(int gestion) { this.gestion = gestion; }

    public int getPartida() { return partida; }
    public void setPartida(int partida) { this.partida = partida; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }
}