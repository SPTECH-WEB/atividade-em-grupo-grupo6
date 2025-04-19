package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;
    private final List<PedidoObserver> observadores;

    public FreteService(List<FreteStrategy> estrategias, List<PedidoObserver> observadores) {
        this.estrategias = estrategias;
        this.observadores = observadores;
    }


    public double calcular(String tipo, double peso, Pedido pedido) {
        double valor =  estrategias.stream()
                .filter(e -> e.tipo().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de Frete inválido!"))
                .calcular(peso);

        observadores.forEach(obs -> obs.notificarPedido(pedido));

        return valor;
    }


}
