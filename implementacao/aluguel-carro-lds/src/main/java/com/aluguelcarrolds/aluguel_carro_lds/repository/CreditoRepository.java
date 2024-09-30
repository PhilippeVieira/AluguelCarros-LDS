package com.aluguelcarrolds.aluguel_carro_lds.repository;

import com.aluguelcarrolds.aluguel_carro_lds.model.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Long> {
}

