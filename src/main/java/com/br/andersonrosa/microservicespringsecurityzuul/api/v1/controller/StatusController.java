package com.br.andersonrosa.microservicespringsecurityzuul.api.v1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    @ResponseBody
    public String status() {
        return HttpStatus.OK + " - MS 2";
    }

}
