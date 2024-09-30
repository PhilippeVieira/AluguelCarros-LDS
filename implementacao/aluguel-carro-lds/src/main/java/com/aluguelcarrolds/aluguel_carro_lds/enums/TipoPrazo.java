package com.aluguelcarrolds.aluguel_carro_lds.enums;

public enum TipoPrazo {
    PRAZO_12(12),
    PRAZO_24(24),
    PRAZO_36(36),
    PRAZO_48(48);

    private final int meses;

    TipoPrazo(int meses) {
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }
}

