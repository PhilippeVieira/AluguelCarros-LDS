package com.aluguelcarrolds.aluguel_carro_lds.repository;

import com.aluguelcarrolds.aluguel_carro_lds.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {
}

