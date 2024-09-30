package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Credito;
import com.aluguelcarrolds.aluguel_carro_lds.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BancoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public Credito criarContratoCredito(Long bancoId, Credito credito) {
        // Lógica para criar contrato de crédito
        return creditoRepository.save(credito);
    }
}
