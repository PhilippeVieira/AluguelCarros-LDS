package com.aluguelcarrolds.aluguel_carro_lds.entityes;
//
//import jakarta.persistence.*;
//import java.util.Date;
//
//@Entity
//public class Pedido {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Date dataCriacao;
//    private String status;
//
//    @ManyToOne
//    private Cliente cliente;
//
//    @OneToOne
//    private Automovel automovel;
//
//    @OneToOne
//    private Contrato contrato;
//
//    @OneToOne
//    private Credito contratoCredito;
//
//    public void analisarPedido() {
//        // Lógica para analisar pedido
//    }
//
//    public void confirmarContrato() {
//        // Lógica para confirmar contrato
//    }
//
//    public void modificarPedido() {
//        // Lógica para modificar pedido
//    }
//
//    public void cancelarPedido() {
//        // Lógica para cancelar pedido
//    }
//
//    // Getters e Setters
//}
