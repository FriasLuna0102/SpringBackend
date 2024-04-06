package org.example.Clases;

import org.example.Clases.Cobertura;

public class RamoProducto {

    private String tipo;
    private String descripcion;
    private Cobertura cobertura;
    private float porcentajeComision;

    public RamoProducto() {
    }

    public RamoProducto(String tipo, String descripcion, Cobertura cobertura, float porcentajeComision) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cobertura = cobertura;
        this.porcentajeComision = porcentajeComision;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
