package com.meli.Futebolistico.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// DTO Response é a classe que vai ser retornada para o cliente
// Response não precisa colocar validações.

//Getters and Setters sempre colados na declaração da classe
@Getter
@Setter
public class ClubeDTOResponce {
    private Long id;
    private String nomeClube;
    private String siglaEstado;
    private LocalDate dataCriacao;
    private Boolean status;

}