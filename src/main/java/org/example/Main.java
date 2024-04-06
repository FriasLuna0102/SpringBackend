package org.example;

import org.example.Clases.Cobertura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main{
    public static void main(String[] args) {

//        Cobertura cobertura1 = new Cobertura();
//        cobertura1.setDescripcion("Primera Cobertura");
//        cobertura1.setMontoCobertura(85);
//
//        List<Cobertura> listCobertura = new ArrayList<>();
//        listCobertura.add(cobertura1);
        System.out.println("Hello world!");
        SpringApplication.run(Main.class,args);
//
//        Cobertura cobertura = Cobertura.buscarCobertura(listCobertura,"Primera Cobertura");
//
//        assert cobertura != null;
//        System.out.println(cobertura.getDescripcion());

    }


}