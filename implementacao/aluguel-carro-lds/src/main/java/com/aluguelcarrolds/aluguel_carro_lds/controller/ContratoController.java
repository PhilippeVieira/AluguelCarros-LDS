package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Contrato;
import com.aluguelcarrolds.aluguel_carro_lds.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    // Endpoint para gerar um contrato
    @PostMapping
    public Contrato gerarContrato(@RequestBody Contrato contrato) {
        return contratoService.gerarContrato(contrato);
    }

    // Endpoint para cancelar um contrato
    @DeleteMapping("/{contratoId}")
    public void cancelarContrato(@PathVariable Long contratoId) {
        contratoService.cancelarContrato(contratoId);
    }
}
