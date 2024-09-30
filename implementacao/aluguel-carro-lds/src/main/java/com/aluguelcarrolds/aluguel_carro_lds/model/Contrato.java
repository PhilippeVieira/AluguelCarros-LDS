package com.aluguelcarrolds.aluguel_carro_lds.model;

import com.aluguelcarrolds.aluguel_carro_lds.enums.TipoContrato;

import java.util.Date;

public class Contrato {

    private Date dataAssinatura;
    private Double valor;
    private TipoContrato tipoContrato;

    public void gerarContrato() {
        this.dataAssinatura = new Date();
    }

    public void cancelarContrato() {
        this.valor = 0.0;
    }

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Object getId() {
        return null;
    }

    public void setStatus(String status) {

    }
}
