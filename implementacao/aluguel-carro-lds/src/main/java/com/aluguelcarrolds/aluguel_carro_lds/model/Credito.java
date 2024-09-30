package com.aluguelcarrolds.aluguel_carro_lds.model;

public class Credito {

    private Double valorCredito;
    private Double taxaJuros;
    private int prazo;
    private Banco bancoQueConcedeu;

    public void calcularParcelas() {
        Double valorParcela = (valorCredito * (1 + (taxaJuros / 100))) / prazo;
        System.out.println("Valor da parcela: " + valorParcela);
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public Banco getBancoQueConcedeu() {
        return bancoQueConcedeu;
    }

    public void setBancoQueConcedeu(Banco bancoQueConcedeu) {
        this.bancoQueConcedeu = bancoQueConcedeu;
    }
}
