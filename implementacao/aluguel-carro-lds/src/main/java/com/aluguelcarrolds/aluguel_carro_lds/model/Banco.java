package com.aluguelcarrolds.aluguel_carro_lds.model;

import com.aluguelcarrolds.aluguel_carro_lds.enums.TipoPrazo;
import jakarta.persistence.*;

@Entity
public class Banco extends Agente {

    public void criarContratoCredito(Credito credito, Double valorCredito, Double taxaJuros, TipoPrazo prazo) {
        credito.setValorCredito(valorCredito);
        credito.setTaxaJuros(taxaJuros);
        credito.setPrazo(prazo.getMeses());
    }

}
