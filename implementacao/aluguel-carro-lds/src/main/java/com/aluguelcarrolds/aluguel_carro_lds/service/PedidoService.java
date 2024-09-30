package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido consultarPedido(Long pedidoId) {
        return pedidoRepository.findById(pedidoId).orElseThrow();
    }

    public Pedido analisarPedido(Long pedidoId) {
        Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow();
        pedido.analisarPedido();
        return pedidoRepository.save(pedido);
    }

    public Pedido confirmarContrato(Long pedidoId) {
        Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow();
        pedido.confirmarContrato();
        return pedidoRepository.save(pedido);
    }

    public void cancelarPedido(Long pedidoId) {
        Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow();
        pedido.cancelarPedido();
        pedidoRepository.save(pedido);
    }
}
