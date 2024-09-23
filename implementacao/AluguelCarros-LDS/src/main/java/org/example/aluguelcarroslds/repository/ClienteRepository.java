package org.example.aluguelcarroslds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.aluguelcarroslds.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
