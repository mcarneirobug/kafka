package com.dio.expert.kafkaexpert.controller;

import com.dio.expert.kafkaexpert.domain.Pedido;
import com.dio.expert.kafkaexpert.service.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private static final String topic = "salvarPedido";

    private final RegistraEventoService service;

    @PostMapping(path = "/api/salvar-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody Pedido pedido) {

        service.adicionarEvento(topic, pedido);

        return ResponseEntity.ok("Success");
    }

}
