package com.meli.Futebolistico.controller;

import com.meli.Futebolistico.dto.EstadioDTO;
import com.meli.Futebolistico.model.Estadio;
import com.meli.Futebolistico.service.EstadioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("estadio")
public class EstadioController {
    @Autowired
    EstadioService estadioService;

    @PostMapping
    // Resposta (no tipo de código de status)    Entrada
    public ResponseEntity<Estadio> criarEstadio(@RequestBody EstadioDTO estadioDTO) {
        //classe Estadio criando um objeto. Service recebe o parametro da entrada e cria um objeto Estadio.
        Estadio estadio = estadioService.criarEstadio(estadioDTO);
        //retorna o objeto estadio criado e retorna o status code 201
        return ResponseEntity.status(201).body(estadio);
    }
//
//    @PutMapping
//    public ResponseEntity<Estadio> atualizarEstadio(@RequestBody EstadioDTO estadioDTO) {
//        Estadio estadio = estadioService.atualizarEstadio(estadioDTO);
//        return ResponseEntity.status(200).body(estadio);
//    }
}
