package com.aluguelcarrolds.aluguel_carro_lds.service;

import com.aluguelcarrolds.aluguel_carro_lds.model.Automovel;
import com.aluguelcarrolds.aluguel_carro_lds.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    public List<Automovel> consultarAutomoveis() {
        return automovelRepository.findAll();
    }

    public boolean verificarDisponibilidade(String matricula) {
        // Lança uma exceção se o automóvel não for encontrado
        Automovel automovel = (Automovel) automovelRepository.findByMatricula(matricula)
                .orElseThrow(() -> new NoSuchElementException("Automóvel não encontrado com matrícula: " + matricula));

        return automovel.disponibilidade();
    }
}
