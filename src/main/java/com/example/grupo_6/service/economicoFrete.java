package com.example.grupo_6.service;

import org.springframework.stereotype.Component;

@Component
public class economicoFrete  implements FreteStrategy {
    @Override
    public double calcular(double peso){
        return peso * 1.0;
    }

    @Override
    public String tipo(){
        return "Peconomico";
    }
}
