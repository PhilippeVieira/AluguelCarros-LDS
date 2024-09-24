package com.aluguelcarrolds.aluguel_carro_lds.repository;


import com.aluguelcarrolds.aluguel_carro_lds.entityes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
