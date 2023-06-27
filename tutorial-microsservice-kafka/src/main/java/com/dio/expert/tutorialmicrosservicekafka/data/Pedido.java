package com.dio.expert.tutorialmicrosservicekafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;

}
