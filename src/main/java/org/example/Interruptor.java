package org.example;

public class Interruptor {
    private String situacao;

    public Interruptor() {}

    public String getSituacao() {
        return situacao;
    }

    public void ligarInterruptor() {
        this.situacao = "Interruptor ligado";
    }

    public void desligarInterruptor() {
        this.situacao = "Interruptor desligado";
    }
}
