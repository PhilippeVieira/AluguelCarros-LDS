package org.example.aluguelcarroslds.models;

import org.example.aluguelcarroslds.enums.TipoAgente;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Agente extends Usuario {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAgente tipoAgente;

    public abstract void avaliarPedido();

    public abstract void modificarPedido();
}
