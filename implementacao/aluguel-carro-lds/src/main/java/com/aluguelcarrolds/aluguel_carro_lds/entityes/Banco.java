package com.aluguelcarrolds.aluguel_carro_lds.entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // LOMBOK
public class Banco {

    @Id
    private Long id;
}

