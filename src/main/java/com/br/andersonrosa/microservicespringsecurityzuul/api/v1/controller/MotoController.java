package com.br.andersonrosa.microservicespringsecurityzuul.api.v1.controller;

import com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter.MotoPresenter;
import com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter.MotoPresenterJson;
import com.br.andersonrosa.microservicespringsecurityzuul.api.v1.presenter.model.MotoPresenterModelJson;
import com.br.andersonrosa.microservicespringsecurityzuul.domain.moto.entry.dto.MotoInput;
import com.br.andersonrosa.microservicespringsecurityzuul.domain.moto.entry.dto.MotoOutput;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@AllArgsConstructor
public class MotoController {

    //private MotoEntryGet motoEntryGet;
    private MotoPresenter<MotoPresenterModelJson> motoPresenter;

    @GetMapping("/moto")
    @ResponseBody
    public MotoPresenterModelJson getMoto() throws Exception {
        MotoInput motoInput = new MotoInput("CBR", "Honda");

       // MotoOutput motoOutput = motoEntryGet.moto(motoInput);
        MotoOutput motoOutput = new MotoOutput("CBR", "Honda");

       return motoPresenter.criaPresenterMoto(motoOutput);
    }

}
