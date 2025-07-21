package com.meli.Futebolistico.service;

import com.meli.Futebolistico.dto.ClubeDTO;
import com.meli.Futebolistico.model.Clube;
import com.meli.Futebolistico.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubeService {
    @Autowired
    ClubeRepository clubeRepository;

    public Clube criarClube(ClubeDTO clubeDTO) {

        Clube clube = new Clube();
        clube.setNomeClube(clubeDTO.getNomeClube());
        clube.setSiglaEstado(clubeDTO.getSiglaEstado());
        clube.setDataCriacao(clubeDTO.getDataCriacao());
        return clubeRepository.save(clube);
    }
}
