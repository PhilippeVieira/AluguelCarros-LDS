package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Cliente;
import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/{clienteId}/pedidos")
    public Pedido criarPedido(@PathVariable Long clienteId, @RequestBody Pedido pedido) {
        return clienteService.criarPedido(clienteId, pedido);
    }

    @PutMapping("/{clienteId}/pedidos/{pedidoId}")
    public Pedido modificarPedido(@PathVariable Long clienteId, @PathVariable Long pedidoId, @RequestBody Pedido pedido) {
        return clienteService.modificarPedido(clienteId, pedidoId, pedido);
    }

    @GetMapping("/{clienteId}/pedidos")
    public List<Pedido> consultarPedidos(@PathVariable Long clienteId) {
        return clienteService.consultarPedidos(clienteId);
    }

    @DeleteMapping("/{clienteId}/pedidos/{pedidoId}")
    public void cancelarPedido(@PathVariable Long clienteId, @PathVariable Long pedidoId) {
        clienteService.cancelarPedido(clienteId, pedidoId);
    }
}
