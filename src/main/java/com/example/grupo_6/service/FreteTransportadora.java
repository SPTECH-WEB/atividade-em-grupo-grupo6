package com.example.grupo_6.service;

import org.springframework.stereotype.Component;

@Component
public class FreteTransportadora implements FreteStrategy {
    @Override
    public  double calcular(double peso){
        return peso * 2.0  + 10;
    }
    @Override
    public String tipo(){
        return "Transportadora";
    }
}
