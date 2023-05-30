package org.example;

public class DesligarInterruptorTarefa implements  Tarefa{
    private Interruptor interruptor;

    public DesligarInterruptorTarefa(Interruptor interruptor) {
        this.interruptor = interruptor;
    }

    public void executar() {
        this.interruptor.desligarInterruptor();
    }

    public void cancelar() {
        this.interruptor.ligarInterruptor();
    }
}
