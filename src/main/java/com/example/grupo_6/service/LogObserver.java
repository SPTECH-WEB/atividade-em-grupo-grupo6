package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class LogObserver implements PedidoObserver {

    @Override
    public void notificarPedido(Pedido pedido) {
        System.out.println("📝 Log registrado: Pedido #" + pedido.getId() + " processado.");
    }
}

