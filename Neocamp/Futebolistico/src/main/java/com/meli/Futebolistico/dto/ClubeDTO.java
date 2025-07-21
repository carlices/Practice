package com.meli.Futebolistico.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

//Getters and Setters sempre colados na declaração da classe
@Getter
@Setter
public class ClubeDTO {
    private String nomeClube;
    private String siglaEstado;
    private LocalDate dataCriacao;

}
