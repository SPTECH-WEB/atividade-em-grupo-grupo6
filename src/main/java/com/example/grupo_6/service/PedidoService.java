package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;
import com.example.grupo_6.repository.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido criarPedido(@Valid Pedido novoPedido){
        return repository.save(novoPedido);
    }

    public List<Pedido> listarPedidos(){
        return repository.findAll();
    }
}
