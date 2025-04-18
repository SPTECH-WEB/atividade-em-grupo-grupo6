package com.example.grupo_6.service;

import java.util.List;

public class FreteService {
    private final List<FreteStrategy> estrategias;
    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String tipo, double peso) {
        return estrategias.stream()
                .filter(e -> e.tipo().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de Frete inválido!"))
                .calcular(peso);
    }
}
