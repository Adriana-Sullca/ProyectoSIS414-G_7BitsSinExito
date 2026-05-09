package com.example.ProyectoSis414.model;

public class UnidadAdmin {

    private Long id;
    private String entidad;
    private String unidad;
    private String descripcion;
    private String ciudad;

    public UnidadAdmin() {
    }

    public UnidadAdmin(Long id, String entidad, String unidad,
                       String descripcion, String ciudad) {
        this.id = id;
        this.entidad = entidad;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}