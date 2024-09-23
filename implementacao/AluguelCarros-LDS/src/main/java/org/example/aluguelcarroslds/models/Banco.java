package org.example.aluguelcarroslds.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Banco extends Agente {

    @Override
    public void avaliarPedido() {
        System.out.println("Banco avaliando o pedido com base em análise de crédito.");
    }

    @Override
    public void modificarPedido() {
        System.out.println("Banco modificando o pedido.");
    }

    public void criarContratoCredito() {
        System.out.println("Contrato de crédito criado pelo banco.");
    }
}

