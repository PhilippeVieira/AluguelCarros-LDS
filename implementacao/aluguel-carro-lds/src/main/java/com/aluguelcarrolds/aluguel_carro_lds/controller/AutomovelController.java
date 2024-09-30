package com.aluguelcarrolds.aluguel_carro_lds.controller;

import com.aluguelcarrolds.aluguel_carro_lds.model.Automovel;
import com.aluguelcarrolds.aluguel_carro_lds.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automoveis")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    // Endpoint para consultar todos os automóveis
    @GetMapping
    public List<Automovel> consultarAutomoveis() {
        return automovelService.consultarAutomoveis();
    }

    // Endpoint para verificar a disponibilidade de um automóvel
    @GetMapping("/{matricula}/disponibilidade")
    public boolean verificarDisponibilidade(@PathVariable String matricula) {
        return automovelService.verificarDisponibilidade(matricula);
    }
}
