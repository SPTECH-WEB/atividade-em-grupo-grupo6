package com.example.grupo_6.service;

import com.example.grupo_6.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.Observer;

@Component
public class EmailObserver implements PedidoObserver {

    @Override
    public void notificarPedido(Pedido pedido) {
        System.out.println("📧 E-mail enviado para " + pedido.getCliente());
    }
}
