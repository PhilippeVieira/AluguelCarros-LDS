package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Automovel;
import com.aluguelcarrolds.aluguel_carro_lds.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    public List<Automovel> consultarAutomoveis() {
        return automovelRepository.findAll();
    }

    public boolean verificarDisponibilidade(String matricula) {
        Automovel automovel = (Automovel) automovelRepository.findByMatricula(matricula).orElseThrow();
        return automovel.disponibilidade();
    }
}
