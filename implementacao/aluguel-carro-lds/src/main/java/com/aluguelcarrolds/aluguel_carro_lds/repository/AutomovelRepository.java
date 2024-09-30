package com.aluguelcarrolds.aluguel_carro_lds.repository;

import com.aluguelcarrolds.aluguel_carro_lds.model.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, String> {
    ScopedValue<Object> findByMatricula(String matricula);
}

