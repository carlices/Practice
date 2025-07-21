package com.meli.Futebolistico.repository;

import com.meli.Futebolistico.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubeRepository extends JpaRepository<Clube, Long> {
    boolean existsByNomeAndSiglaEstado(String nomeClube, String siglaEstado);
}
