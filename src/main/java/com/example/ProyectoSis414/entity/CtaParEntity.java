package com.example.ProyectoSis414.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CtaPar")
public class CtaParEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ctapar;

    private String codigo;
    private String descripcion;

    @Column(precision = 12, scale = 2)
    private BigDecimal monto;

    @Column(name = "codestado")
    private Long codestado;

    @Column(name = "mes")
    private Long mes;

    public CtaParEntity() {
    }

    public Long getCtapar() { return ctapar; }
    public void setCtapar(Long ctapar) { this.ctapar = ctapar; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public Long getCodestado() { return codestado; }
    public void setCodestado(Long codestado) { this.codestado = codestado; }

    public Long getMes() { return mes; }
    public void setMes(Long mes) { this.mes = mes; }
}