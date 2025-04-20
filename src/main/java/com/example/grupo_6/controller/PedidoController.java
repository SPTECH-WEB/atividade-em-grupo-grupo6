package com.example.grupo_6.controller;

import com.example.grupo_6.model.Pedido;
import com.example.grupo_6.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido){
        return ResponseEntity.ok(service.criarPedido(pedido));
    }

    @GetMapping
    public ResponseEntity consultarPedidos(){
        return ResponseEntity.ok(service.listarPedidos());
    }
}
