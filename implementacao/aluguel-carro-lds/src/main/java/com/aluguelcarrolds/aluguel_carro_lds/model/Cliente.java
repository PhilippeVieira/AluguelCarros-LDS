package com.aluguelcarrolds.aluguel_carro_lds.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {

    private String profissao;
    private List<Pedido> pedidos; // Lista para armazenar os pedidos do cliente

    public Cliente() {
        this.pedidos = new ArrayList<>();
    }

    // Método para criar um pedido e adicioná-lo à lista de pedidos do cliente
    public Pedido criarPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    // Método para modificar um pedido existente
    public Pedido modificarPedido(Long pedidoId, Pedido novoPedido) {
        Pedido pedidoExistente = consultarPedido(pedidoId);
        if (pedidoExistente != null) {
            pedidoExistente.setStatus(novoPedido.getStatus());
            pedidoExistente.setAutomovel(novoPedido.getAutomovel());
            pedidoExistente.setContrato(novoPedido.getContrato());
            return pedidoExistente;
        }
        return null; // Pedido não encontrado
    }

    // Método para consultar um pedido pelo seu ID
    public Pedido consultarPedido(Long pedidoId) {
        return pedidos.stream()
                .filter(pedido -> pedido.getId().equals(pedidoId))
                .findFirst()
                .orElse(null); // Retorna null se não encontrar o pedido
    }

    // Método para cancelar um pedido
    public void cancelarPedido(Long pedidoId) {
        Pedido pedido = consultarPedido(pedidoId);
        if (pedido != null) {
            pedido.setStatus("Cancelado");
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
