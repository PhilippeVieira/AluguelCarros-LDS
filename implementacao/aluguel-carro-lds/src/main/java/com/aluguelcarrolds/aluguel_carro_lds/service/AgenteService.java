package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenteService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido avaliarPedido(Long agenteId, Long pedidoId, boolean aprovacao) {
        Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow();
        pedido.setStatus(aprovacao ? "Aprovado" : "Rejeitado");
        return pedidoRepository.save(pedido);
    }

    public Pedido modificarPedido(Long agenteId, Long pedidoId, Pedido pedido) {
        Pedido pedidoExistente = pedidoRepository.findById(pedidoId).orElseThrow();
        pedidoExistente.setStatus(pedido.getStatus());
        return pedidoRepository.save(pedidoExistente);
    }
}
