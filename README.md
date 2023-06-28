# Kafka Producer e Consumer em Java

Este repositório contém dois projetos em Java: um produtor (producer) e um consumidor (consumer) que utilizam o Apache Kafka como broker de mensagens. O objetivo desses projetos é demonstrar a interação entre um produtor que envia mensagens para um tópico do Kafka e um consumidor que as recebe.

## Introdução ao Apache Kafka

O Apache Kafka é uma plataforma de streaming distribuído que permite a publicação e assinatura de fluxos de registros em tempo real. É projetado para ser escalável, durável e tolerante a falhas. O Kafka é amplamente utilizado em cenários de processamento de dados em tempo real, streaming de eventos, ingestão de dados, entre outros.

O Kafka opera em um modelo de publicação/assinatura, onde os produtores (producers) enviam mensagens para tópicos específicos e os consumidores (consumers) se inscrevem nesses tópicos para receber as mensagens. O Kafka armazena as mensagens em tópicos particionados, permitindo o processamento paralelo e a escalabilidade horizontal.

## Pré-requisitos

Certifique-se de ter o Docker instalado e funcionando em sua máquina antes de executar esses projetos. 

## Configuração do ambiente

1. Clone este repositório.
2. Navegue até o diretório do projeto.
3. Inicie o ambiente Docker:
````shell
  docker-compose up -d
````

