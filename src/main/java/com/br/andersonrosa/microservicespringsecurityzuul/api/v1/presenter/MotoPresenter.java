package com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter;

import com.br.andersonrosa.microservicespringsecurityzuul.domain.moto.entry.dto.MotoOutput;

public interface MotoPresenter<T> {

    T criaPresenterMoto(MotoOutput motoOutput) throws Exception;

}
