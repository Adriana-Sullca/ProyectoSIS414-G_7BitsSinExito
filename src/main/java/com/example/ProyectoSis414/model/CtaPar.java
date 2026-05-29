package com.example.ProyectoSis414.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CtaPar")
public class CtaPar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CtaPar")
    private Long id;

    @Column(name = "codigo", length = 20)
    private String codigo;

    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "codestado")
    private Integer codestado;

    @Column(name = "mes")
    private Integer mes;

    public CtaPar() {
    }
    public CtaPar(Long id, String codigo, String descripcion, Double monto, Integer codestado, Integer mes) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
        this.codestado = codestado;
        this.mes = mes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getCodestado() {
        return codestado;
    }

    public void setCodestado(Integer codestado) {
        this.codestado = codestado;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }
}
