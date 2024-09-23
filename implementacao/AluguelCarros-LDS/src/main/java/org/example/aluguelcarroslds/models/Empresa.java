package org.example.aluguelcarroslds.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Empresa extends Agente {

    @Override
    public void avaliarPedido() {
        System.out.println("Empresa avaliando o pedido com base em análise financeira.");
    }

    @Override
    public void modificarPedido() {
        System.out.println("Empresa modificando o pedido.");
    }
}
