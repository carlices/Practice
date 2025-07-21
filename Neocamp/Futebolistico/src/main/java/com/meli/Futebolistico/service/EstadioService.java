package com.meli.Futebolistico.service;

import com.meli.Futebolistico.dto.EstadioDTO;
import com.meli.Futebolistico.model.Estadio;
import com.meli.Futebolistico.repository.EstadioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadioService {
    @Autowired
    EstadioRepository estadioRepository;

    public Estadio criarEstadio(EstadioDTO estadioDTO) {

        Estadio estadio = new Estadio();
        estadio.setNomeEstadio(estadioDTO.getNomeEstadio());
        estadio.setCidadeEstadio(estadioDTO.getCidadeEstadio());
        return estadioRepository.save(estadio);
    }
}
