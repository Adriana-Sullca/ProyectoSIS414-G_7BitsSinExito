package com.example.ProyectoSis414.model;

public class CtaPar {

    private int codcont;
    private int partida;
    private int gestion;

    public CtaPar() {}

    public CtaPar(int codcont, int partida, int gestion) {
        this.codcont = codcont;
        this.partida = partida;
        this.gestion = gestion;
    }

    public int getCodcont() { return codcont; }
    public void setCodcont(int codcont) { this.codcont = codcont; }

    public int getPartida() { return partida; }
    public void setPartida(int partida) { this.partida = partida; }

    public int getGestion() { return gestion; }
    public void setGestion(int gestion) { this.gestion = gestion; }
}