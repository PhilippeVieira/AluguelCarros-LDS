package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{pedidoId}")
    public Pedido consultarPedido(@PathVariable Long pedidoId) {
        return pedidoService.consultarPedido(pedidoId);
    }

    @PostMapping("/{pedidoId}/analisar")
    public Pedido analisarPedido(@PathVariable Long pedidoId) {
        return pedidoService.analisarPedido(pedidoId);
    }

    @PostMapping("/{pedidoId}/confirmar")
    public Pedido confirmarContrato(@PathVariable Long pedidoId) {
        return pedidoService.confirmarContrato(pedidoId);
    }

    @DeleteMapping("/{pedidoId}")
    public void cancelarPedido(@PathVariable Long pedidoId) {
        pedidoService.cancelarPedido(pedidoId);
    }
}
