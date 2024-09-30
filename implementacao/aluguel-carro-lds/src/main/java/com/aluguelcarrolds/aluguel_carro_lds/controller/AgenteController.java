package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Pedido;
import com.aluguelcarrolds.aluguel_carro_lds.service.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agentes")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @PostMapping("/{agenteId}/pedidos/{pedidoId}/avaliar")
    public Pedido avaliarPedido(@PathVariable Long agenteId, @PathVariable Long pedidoId, @RequestParam boolean aprovacao) {
        return agenteService.avaliarPedido(agenteId, pedidoId, aprovacao);
    }

    @PutMapping("/{agenteId}/pedidos/{pedidoId}")
    public Pedido modificarPedido(@PathVariable Long agenteId, @PathVariable Long pedidoId, @RequestBody Pedido pedido) {
        return agenteService.modificarPedido(agenteId, pedidoId, pedido);
    }
}
