package org.example.aluguelcarroslds.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

import org.example.aluguelcarroslds.enums.TipoContrato;

@Data
@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dataAssinatura;

    @Column(nullable = false)
    private Double valor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoContrato tipoContrato;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "agente_id")
    private Agente agente;

    // Métodos relacionados ao contrato
    public void gerarContrato() {
        System.out.println("Contrato gerado.");
    }

    public void cancelarContrato() {
        System.out.println("Contrato cancelado.");
    }
}
