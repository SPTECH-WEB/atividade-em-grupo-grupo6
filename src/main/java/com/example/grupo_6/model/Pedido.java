package com.example.grupo_6.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "o nome do cliente nn pode ser vazio")
    private String cliente;
    @NotBlank(message = "o nome do produto nn pode ser vazio")
    private String produto;
    @NotNull(message = "o peso nn pode ser vazio")
    private Double peso;
    @NotNull(message = "o tipo de entrega nn pode ser vazio")
    private String tipoEntrega;
}
