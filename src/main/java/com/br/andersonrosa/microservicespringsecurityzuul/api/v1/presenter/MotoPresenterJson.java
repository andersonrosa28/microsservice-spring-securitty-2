package com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter;

import com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter.model.MotoPresenterModelJson;
import com.br.andersonrosa.microservicespringsecurityzuul.domain.moto.entry.dto.MotoOutput;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class MotoPresenterJson implements MotoPresenter<MotoPresenterModelJson>{

    @Override
    public MotoPresenterModelJson criaPresenterMoto(MotoOutput motoOutput) throws Exception {
        if(validaEntrarNoPresenter(motoOutput)){
            throw new Exception("Entrada invalida");
        }
        return MotoPresenterModelJson
                .builder()
                .nome(motoOutput.getNome())
                .marca(motoOutput.getMarca())
                .build();
    }

    public boolean validaEntrarNoPresenter(MotoOutput motoOutput){
        return motoOutput == null || ObjectUtils.isEmpty(motoOutput.getNome());
    }
}
