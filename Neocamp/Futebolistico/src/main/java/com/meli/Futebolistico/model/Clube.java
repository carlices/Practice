package com.meli.Futebolistico.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// Essa classe faz referencia as colunas da tabela e tambem pode estabelecer relacionamentos entre tabelas.
// Aqui as variaveis que fazem referencia as colunas precisam ter o mesmo nome das colunas no banco de dados ou usar a anotação @Column(name = "nome_da_coluna")

@Getter
@Setter
@Entity
public class Clube {
    @Id //chave única para cada registro da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "nome")
    private String nomeClube;
    private String siglaEstado;
    private LocalDate dataCriacao;
    private Boolean status;
}
