package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Credito;
import com.aluguelcarrolds.aluguel_carro_lds.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/creditos")
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @PostMapping("/{creditoId}/calcularParcelas")
    public void calcularParcelas(@PathVariable Long creditoId) {
        creditoService.calcularParcelas(creditoId);
    }
}
