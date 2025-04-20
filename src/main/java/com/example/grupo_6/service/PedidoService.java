package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;
import com.example.grupo_6.repository.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;
    private final List<PedidoObserver> observadores;

    public PedidoService(List<PedidoObserver> observadores) {
        this.observadores = observadores;
    }

    public Pedido criarPedido(@Valid Pedido pedido){
        Pedido salvo = repository.save(pedido);
        observadores.forEach(obs -> obs.notificarPedido(pedido));
        return salvo;

    }

    public List<Pedido> listarPedidos(){
        return repository.findAll();
    }
}
