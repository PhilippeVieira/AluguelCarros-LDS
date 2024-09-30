package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Credito;
import com.aluguelcarrolds.aluguel_carro_lds.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bancos")
public class BancoController {

    @Autowired
    private BancoService bancoService;

    @PostMapping("/{bancoId}/creditos")
    public Credito criarContratoCredito(@PathVariable Long bancoId, @RequestBody Credito credito) {
        return bancoService.criarContratoCredito(bancoId, credito);
    }
}
