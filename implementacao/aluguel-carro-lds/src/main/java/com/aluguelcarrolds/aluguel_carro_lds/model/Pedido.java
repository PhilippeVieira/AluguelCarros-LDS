package com.aluguelcarrolds.aluguel_carro_lds.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Pedido {

    private LocalDate dataCriacao;
    private String status;
    private Cliente cliente;
    private Automovel automovel;
    private Contrato contrato;
    private Credito contratoCredito;

    public void analisarPedido() {
        if (this.status.equals("Pendente")) {
            this.status = "Em Análise";
        }
    }

    public void confirmarContrato() {
        if (this.status.equals("Aprovado")) {
            this.status = "Confirmado";
            contrato.gerarContrato();
        }
    }

    public void modificarPedido(Pedido novoPedido) {
        this.automovel = novoPedido.getAutomovel();
        this.contrato = novoPedido.getContrato();
        this.status = novoPedido.getStatus();
    }

    public void cancelarPedido() {
        this.status = "Cancelado";
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void setContratoCredito(Credito contratoCredito) {
        this.contratoCredito = contratoCredito;
    }

    public Object getId() {
        return null;
    }
}
