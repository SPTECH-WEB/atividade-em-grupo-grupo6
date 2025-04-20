package com.example.grupo_6.service;
import com.example.grupo_6.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class SmsObserver implements PedidoObserver {

    @Override
    public void notificarPedido(Pedido pedido) {
        System.out.println("📱 Notificação enviada para " + pedido.getCliente());
    }
}
