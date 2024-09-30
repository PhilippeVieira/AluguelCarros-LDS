package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Cliente;
import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.repository.ClienteRepository;
import com.aluguelcarrolds.aluguel_carro_lds.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPedido(Long clienteId, Pedido pedido) {
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow();
        pedido.setCliente(cliente);
        return pedidoRepository.save(pedido);
    }

    public Pedido modificarPedido(Long clienteId, Long pedidoId, Pedido pedido) {
        Pedido pedidoExistente = pedidoRepository.findById(pedidoId).orElseThrow();
        // Modificar os campos necessários do pedido existente com base no novo pedido
        pedidoExistente.setStatus(pedido.getStatus());
        return pedidoRepository.save(pedidoExistente);
    }

    public List<Pedido> consultarPedidos(Long clienteId) {
        Cliente cliente = clienteRepository.findById(clienteId).orElseThrow();
        return cliente.getPedidos();
    }

    public void cancelarPedido(Long clienteId, Long pedidoId) {
        Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow();
        pedido.setStatus("Cancelado");
        pedidoRepository.save(pedido);
    }
}
