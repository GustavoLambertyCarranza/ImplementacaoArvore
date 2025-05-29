package com.company;

class No {
    public boolean valor;
    String value;
    No esquerda, direita;
    int fatorBalanceamento;

    public No(String value) {
        this.value = value;
        this.esquerda = null;
        this.direita = null;
        this.fatorBalanceamento = 0;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }
}
