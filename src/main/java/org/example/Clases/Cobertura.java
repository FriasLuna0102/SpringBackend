package org.example.Clases;

import java.util.ArrayList;
import java.util.List;
import org.example.controladora;

public class Cobertura {

    private String descripcion;
    private String riesgo;
    private float porcentajeCobertura;
    private long montoCobertura;

    private float deducible;

    public Cobertura(String descripcion, String riesgo, float porcentajeCobertura, long montoCobertura, float deducible) {
        this.descripcion = descripcion;
        this.riesgo = riesgo;
        this.porcentajeCobertura = porcentajeCobertura;
        this.montoCobertura = montoCobertura;
        this.deducible = deducible;
    }

    public Cobertura() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public float getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(float porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public long getMontoCobertura() {
        return montoCobertura;
    }

    public void setMontoCobertura(long montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

    public float getDeducible() {
        return deducible;
    }

    public void setDeducible(float deducible) {
        this.deducible = deducible;
    }


    public static Cobertura buscarCobertura(List<Cobertura> coberturas,String descripcion){

        if(descripcion != null){
            for(Cobertura cobertura : coberturas){

                if(cobertura.getDescripcion().equals(descripcion)){
                    System.out.println("La encontro");
                    return cobertura;
                }
            }
        }
        return null;
    }
}
