package com.aluguelcarrolds.aluguel_carro_lds.entityes;

import com.aluguelcarrolds.aluguel_carro_lds.enums.TipoAgente;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Agente extends Usuario {

    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoAgente tipoAgente;


}
