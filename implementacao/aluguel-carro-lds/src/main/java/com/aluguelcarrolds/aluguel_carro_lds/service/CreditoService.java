package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Credito;
import com.aluguelcarrolds.aluguel_carro_lds.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public void calcularParcelas(Long creditoId) {
        Credito credito = creditoRepository.findById(creditoId).orElseThrow();
    }
}
