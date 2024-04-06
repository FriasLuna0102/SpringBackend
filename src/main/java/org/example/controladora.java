package org.example;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Clases.Cobertura;
import org.example.Clases.RamoProducto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class controladora {

    List<Cobertura> listCobertura = new ArrayList<>();
    List<RamoProducto> listRamoProducto = new ArrayList<>();
    public List<Cobertura> getListCobertura() {
        return listCobertura;
    }

    public void setListCobertura(List<Cobertura> listCobertura) {
        this.listCobertura = listCobertura;
    }

    public static void setIntancia(controladora intancia) {
        controladora.intancia = intancia;
    }

    private static controladora intancia;

    public static controladora getIntancia(){
        if(intancia == null){
            intancia = new controladora();
        }
        return intancia;
    }

    @PostMapping("/crearCobertura")
    public Cobertura crearCobertura(@RequestBody Cobertura cobertura) {
        System.out.println("Descripción de la Cobertura: " + cobertura.getDescripcion());

        Cobertura cobertura1 = new Cobertura();
        cobertura1.setDescripcion(cobertura.getDescripcion());
        cobertura1.setMontoCobertura(cobertura.getMontoCobertura());
        cobertura1.setPorcentajeCobertura(cobertura.getPorcentajeCobertura());
        cobertura1.setRiesgo(cobertura.getRiesgo());
        cobertura1.setDeducible(cobertura.getDeducible());

        listCobertura.add(cobertura1);
        return cobertura1;
    }

    @PostMapping("/crearRamoProducto")
    public void crearRamoProducto(@RequestBody String ramoProducto, HttpServletRequest request) throws JsonProcessingException{

        ObjectMapper objectMapper = new ObjectMapper();



        RamoProducto ramoProducto1 = objectMapper.readValue(ramoProducto,RamoProducto.class);
        Cobertura cobertura = Cobertura.buscarCobertura(listCobertura,ramoProducto1.getCobertura().getDescripcion());

        RamoProducto ramoProducNew = new RamoProducto();
        ramoProducNew.setDescripcion(ramoProducto1.getDescripcion());
        ramoProducNew.setCobertura(cobertura);
        ramoProducNew.setTipo(ramoProducto1.getTipo());
        ramoProducNew.setPorcentajeComision(ramoProducto1.getPorcentajeComision());


       listRamoProducto.add(ramoProducNew);

    }

}
