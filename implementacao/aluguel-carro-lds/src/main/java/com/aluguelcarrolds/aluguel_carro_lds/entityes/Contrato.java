package com.aluguelcarrolds.aluguel_carro_lds.entityes;

import com.aluguelcarrolds.aluguel_carro_lds.enums.TipoContrato;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data // LOMBOK
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataAssinatura;

    private Double valor;

    @Enumerated(EnumType.STRING)
    private TipoContrato tipoContrato;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}
