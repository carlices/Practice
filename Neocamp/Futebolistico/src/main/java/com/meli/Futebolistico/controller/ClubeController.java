package com.meli.Futebolistico.controller;

import com.meli.Futebolistico.dto.ClubeDTO;
import com.meli.Futebolistico.model.Clube;
import com.meli.Futebolistico.service.ClubeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clube") //http://localhost:8080/clube
public class ClubeController {
    @Autowired
    ClubeService clubeService;


    // Ao inves de Clube, um Clube DTO de resposta. Model não pode ser exposto e interagir com o usuario.
    // Clube seria a saida da função, Entre parenteses é a entrada da função, Entre chaves é o corpo da função (o roda no código)
    @PostMapping
    public Clube criarClube(@Valid @RequestBody ClubeDTO clubeDTO) {
       return clubeService.criarClube(clubeDTO);

    }

    @PutMapping("/{id}") // ex. http://localhost:8080/clube/1
    public Clube atualizarClube(@PathVariable Long id, @RequestBody ClubeDTO clubeDTO) {
        return clubeService.atualizarClube(id, clubeDTO);

    }

    @GetMapping // Precisa de resposta? Qual caminho para entregar a resposta?
    public List<Clube> listarClubes() {
        return clubeService.listarClubes();
    }

    @GetMapping()
    public Clube buscarClubePorId(@PathVariable Long id) {
        return clubeService.buscarClubePorId(id);
    }



}
