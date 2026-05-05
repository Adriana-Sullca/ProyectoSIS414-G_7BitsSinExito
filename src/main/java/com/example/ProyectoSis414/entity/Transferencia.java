package com.example.ProyectoSis414.entity;

public class Transferencia {

    private Long id;
    private String unidadActual;
    private String oficinaActual;
    private String responsableActual;
    private String nuevaUnidad;
    private String nuevaOficina;
    private String nuevoResponsable;
    private String auxiliar;

    public Transferencia() {
    }

    public Transferencia(Long id, String unidadActual, String oficinaActual,
                         String responsableActual, String nuevaUnidad,
                         String nuevaOficina, String nuevoResponsable,
                         String auxiliar) {
        this.id = id;
        this.unidadActual = unidadActual;
        this.oficinaActual = oficinaActual;
        this.responsableActual = responsableActual;
        this.nuevaUnidad = nuevaUnidad;
        this.nuevaOficina = nuevaOficina;
        this.nuevoResponsable = nuevoResponsable;
        this.auxiliar = auxiliar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnidadActual() {
        return unidadActual;
    }

    public void setUnidadActual(String unidadActual) {
        this.unidadActual = unidadActual;
    }

    public String getOficinaActual() {
        return oficinaActual;
    }

    public void setOficinaActual(String oficinaActual) {
        this.oficinaActual = oficinaActual;
    }

    public String getResponsableActual() {
        return responsableActual;
    }

    public void setResponsableActual(String responsableActual) {
        this.responsableActual = responsableActual;
    }

    public String getNuevaUnidad() {
        return nuevaUnidad;
    }

    public void setNuevaUnidad(String nuevaUnidad) {
        this.nuevaUnidad = nuevaUnidad;
    }

    public String getNuevaOficina() {
        return nuevaOficina;
    }

    public void setNuevaOficina(String nuevaOficina) {
        this.nuevaOficina = nuevaOficina;
    }

    public String getNuevoResponsable() {
        return nuevoResponsable;
    }

    public void setNuevoResponsable(String nuevoResponsable) {
        this.nuevoResponsable = nuevoResponsable;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public void setAuxiliar(String auxiliar) {
        this.auxiliar = auxiliar;
    }
}