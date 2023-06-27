package com.dio.expert.tutorialmicrosservicekafka.service;

import com.dio.expert.tutorialmicrosservicekafka.data.Pedido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SalvarPedidoService {

    @KafkaListener(topics = "salvarPedido", groupId = "microsservicoSalvaPedido")
    private void executar(ConsumerRecord<String, String> record) {

        log.info("Key: {}", record.key());
        log.info("Headers: {}", record.headers());
        log.info("Partition: {}", record.partition());

        String dados = record.value();

        ObjectMapper mapper = new ObjectMapper();
        Pedido pedido;

        try {
            pedido = mapper.readValue(dados, Pedido.class);
        } catch (JsonProcessingException ex) {
            log.error("Falha ao converter evento [dado={}]", dados, ex);
            return;
        }

        log.info("Evento recebido: {}", pedido);

        // gravar no banco de dados
        // responder de volta para fila que foi salvo

    }

    private void gravar(Pedido pedido) {
        // gravar no BD
    }

}
