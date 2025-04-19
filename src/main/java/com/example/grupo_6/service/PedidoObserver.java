package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;

public interface PedidoObserver {
    void notificarPedido(Pedido pedido);
}
