package com.aluguelcarrolds.aluguel_carro_lds.entityes;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data // LOMBOK
@EqualsAndHashCode(callSuper = true) // Para gerar equals/hashCode com base na superclasse
@Entity
public class Cliente extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para auto-incrementar o ID
    private Long id;

    private String profissao;

    @OneToMany(mappedBy = "cliente")
    private List<Contrato> rendimentos;
}
