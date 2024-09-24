package com.aluguelcarrolds.aluguel_carro_lds.entityes;

import jakarta.persistence.*;

@MappedSuperclass
// @MappedSuperclass => Nao mapeia para banco de dados
public abstract class Usuario {
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String email;
    private String senha;
}
