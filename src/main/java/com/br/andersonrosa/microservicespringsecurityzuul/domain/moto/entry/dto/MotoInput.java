package com.br.andersonrosa.microservicespringsecurityzuul.domain.moto.entry.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MotoInput {
    private String nome;
    private String marca;
}
