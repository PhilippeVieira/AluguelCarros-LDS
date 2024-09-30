package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Contrato;
import com.aluguelcarrolds.aluguel_carro_lds.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    public Contrato gerarContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    public void cancelarContrato(Long contratoId) {
        Contrato contrato = contratoRepository.findById(contratoId).orElseThrow();
        contrato.cancelarContrato();
        contratoRepository.save(contrato);
    }
}
