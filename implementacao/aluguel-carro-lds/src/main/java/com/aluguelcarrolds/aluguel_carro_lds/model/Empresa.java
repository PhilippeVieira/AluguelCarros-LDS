package com.aluguelcarrolds.aluguel_carro_lds.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data // LOMBOK
@Entity
public class Empresa {
    @Id
    private Long id;
}
