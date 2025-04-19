package com.example.grupo_6.service;

public class TransportadoraTercerizadaAdapter implements FreteStrategy {

    private ApiExternaTransportadora apiExterna = new ApiExternaTransportadora();

    @Override
    public double calcular(double peso) {
        return apiExterna.calculoExterno(peso);
    }

    @Override
    public String tipo() {
        return "Transportadora Tercerizada";
    }
}
