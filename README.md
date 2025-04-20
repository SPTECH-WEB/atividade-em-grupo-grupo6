# 🛒 Grupo 6 - Sistema de Pedidos com Cálculo de Frete
Este projeto é uma API RESTful em Spring Boot para cadastro de pedidos, com cálculo de frete baseado em diferentes estratégias de entrega e notificações automáticas usando o padrão Observer. Ele também simula integração com uma transportadora externa utilizando o padrão Adapter.

# 🚀 Tecnologias Utilizadas
Java 21

Spring Boot

Spring Data JPA

H2 Database

Lombok

Jakarta Validation

# 📮 Endpoints disponíveis
POST /pedido
Cadastra um novo pedido e calcula o frete de acordo com o tipo informado. Também dispara notificações.

Exemplo de request JSON:

{

  "cliente": "Maria Silva",

  "produto": "Notebook",

  "peso": 3.5,

  "tipoEntrega": "Peconomico"

}

GET /pedido
Retorna a lista de pedidos cadastrados.

# 🧠 Padrões de Projeto Utilizados
## 🧩 Strategy
Interface: FreteStrategy
Implementações: ExpressoFrete, economicoFrete, FreteTransportadora, TransportadoraTercerizadaAdapter

Permite encapsular diferentes estratégias de cálculo de frete com base no tipo de entrega.

## 🔁 Adapter
Classe: TransportadoraTercerizadaAdapter
Adapta a classe ApiExternaTransportadora para o padrão esperado por FreteStrategy.

Permite integrar sistemas externos simulando uma API de transportadora.

## 📢 Observer
Interface: PedidoObserver
Implementações: EmailObserver, LogObserver, SmsObserver

Esses observadores são notificados automaticamente após a criação de um pedido, permitindo acoplamento flexível com sistemas de notificação e auditoria.

# ✅ Como Testar a Aplicação
## Faça uma requisição POST para /pedido com um corpo válido (ver exemplo acima).

O sistema calculará o frete com base no tipo de entrega:

"Peconomico" → 1.0 x peso

"Transportadora" → 2.0 x peso + 10

"Transportadora Tercerizada" → 7.5 x peso + 15

## Observe no console a saída das notificações:

📧 E-mail enviado para Maria Silva

📝 Log registrado: Pedido #1 processado.

📱 Notificação enviada para Maria Silva


Faça uma requisição GET em /pedido para listar todos os pedidos.