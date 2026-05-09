package com.example.ProyectoSis414.model;

public class Estado {
    private Long codestado;
    private String nomestado;

    public Estado() {}
    public Estado(Long codestado, String nomestado) {
        this.codestado = codestado;
        this.nomestado = nomestado;
    }
    public Long getCodestado() { return codestado; }
    public void setCodestado(Long codestado) { this.codestado = codestado; }
    public String getNomestado() { return nomestado; }
    public void setNomestado(String nomestado) { this.nomestado = nomestado; }
}