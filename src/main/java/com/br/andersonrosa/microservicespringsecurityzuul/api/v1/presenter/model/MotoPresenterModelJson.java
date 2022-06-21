package com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MotoPresenterModelJson {
    private String nome;
    private String marca;
}
