package com.meli.Futebolistico.controller;

import com.meli.Futebolistico.dto.ClubeDTO;
import com.meli.Futebolistico.model.Clube;
import com.meli.Futebolistico.service.ClubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clube")
public class ClubeController {
    @Autowired
    ClubeService clubeService;

    @PostMapping
    public Clube criarClube(ClubeDTO clubeDTO) {
       return clubeService.criarClube(clubeDTO);

    }


}
