package org.example.aluguelcarroslds.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cliente extends Usuario {
    @Id
    private Long id;
    private String nome;
    private String profissao;
    private String email;
    private String endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contrato> rendimentos = new ArrayList<>();

}
