package com.meli.Futebolistico.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import jakarta.validation.constraints.*;

// Essa classe pode ter menos informações que a classe model.
// É uma boa prática criar as DTOs divididas em Request/Response para evitar que informações sensíveis sejam retornadas ao cliente.
// Request não vai ter o id, pois o id está sendo gerado automaticamente pelo banco de dados.
// Request é onde ficam as exigências de validação, por ex, se um campo é obrigatório, se tem um tamanho mínimo, etc.
// Aqui não é necessário ter o construtor, pois o Spring cria um construtor padrão.
// O construtor é necessário apenas se quiser criar um construtor personalizado.

//Modificadores de acesso em private para poderem ser alterados apenas pelos getters e os setters.
//Ao invés de usar class pode-se usar record para criar uma classe imutável com getters e toString já implementados.
//Record é uma feature do Java 14 em diante. Algo novo e ainda mais abstrato, mais seguro, porém não recomendado no início do aprendizado.
//Getters and Setters sempre colados na declaração da classe
@Getter
@Setter
public class ClubeDTORequest {
    @NotBlank(message = "Nome do clube (Obrigatório)")
    @Size(min = 4, max = 100, message = "O nome deve ter de 4 a 100 caracteres")
    public String nomeClube;

    @NotBlank(message = "Sigla do estado. (Obrigatória)")
    @Pattern(regexp = "^[A-Z]{2}$", message = "A sigla deve ter exatamente 2 letras maiúsculas")
    private String siglaEstado;

    @NotNull(message = "Qual a data de fundação do clube? (Obrigatório)")
    @PastOrPresent(message = "A data de criação não pode ser futura")
    private LocalDate dataCriacao;

    @NotNull(message = "Status (Obrigatório)")
    private Boolean status;
}
