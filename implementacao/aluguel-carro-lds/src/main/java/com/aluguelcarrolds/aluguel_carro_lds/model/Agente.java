package com.aluguelcarrolds.aluguel_carro_lds.model;

import com.aluguelcarrolds.aluguel_carro_lds.enums.TipoAgente;
import jakarta.persistence.*;

@Entity
public class Agente extends Usuario {

    @Enumerated(EnumType.STRING)
    private TipoAgente tipoAgente;
    @Id
    private Long id;

    public void avaliarPedido(Pedido pedido, boolean aprovacao) {
        pedido.setStatus(aprovacao ? "Aprovado" : "Rejeitado");
    }

    public void modificarPedido(Pedido pedido, String novoStatus) {
        pedido.setStatus(novoStatus);
    }
}
