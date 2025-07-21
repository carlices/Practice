package com.meli.Futebolistico.controller;

import com.meli.Futebolistico.dto.EstadioDTO;
import com.meli.Futebolistico.model.Estadio;
import com.meli.Futebolistico.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estadio")
public class EstadioController {
    @Autowired
    EstadioService estadioService;

    @PostMapping
    public Estadio criarEstadio(EstadioDTO estadioDTO) {
        return estadioService.criarEstadio(estadioDTO);
    }
}
